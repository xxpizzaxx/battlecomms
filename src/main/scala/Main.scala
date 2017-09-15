import java.util

import Murmur._
import Ice._

import scala.collection.JavaConverters._

object Main extends App {
  println("hi")

  val communicator = Util.initialize()
  // so we want meta, it allows us to manage the whole server
  val base = communicator.stringToProxy("Meta:default -p 6502")
  val server = Murmur.MetaPrxHelper.checkedCast(base)
  // let's get the uptime to prove it works
  val uptime = server.getUptime
  println(uptime)

  // we need an adapter to mount the callback in
  val adapter = communicator.createObjectAdapterWithEndpoints("Callback.Client", "tcp -h 127.0.0.100")
  adapter.activate()
  // make our auth object
  val auth = new Auth()
  // mount it
  val authenticator = adapter.addWithUUID(auth)
  // transform it
  val transformedAuthenticator = ServerAuthenticatorPrxHelper.uncheckedCast(authenticator)

  def setup(m: MetaPrx): Unit = {
    m.getAllServers.toList.foreach { s =>
      println(s)
      s.setAuthenticator(transformedAuthenticator)
    }
  }

  setup(server)
  println("waitin'")
  //communicator.destroy()
}
