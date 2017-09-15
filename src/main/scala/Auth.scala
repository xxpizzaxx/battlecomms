import java.util

import Ice._
import Murmur._
import cats.data.Kleisli

class Auth extends _ServerAuthenticatorDisp {

  case class Credentials(name: String, pw: String)
  case class Certificates(certificates: Array[Array[Byte]], certhash: String, certstrong: Boolean)
  trait Authenticated
  case object Unknown extends Authenticated
  case object Failure extends Authenticated
  case class Success(newname: Option[String], groups: Option[List[String]]) extends Authenticated

  type Authenticator[E[_]] = Kleisli[E, (Credentials, Certificates), Authenticated]


  /**
    * Called to authenticate a user. If you do not know the username in question, always return -2 from this
    * method to fall through to normal database authentication.
    * Note that if authentication succeeds, murmur will create a record of the user in it's database, reserving
    * the username and id so it cannot be used for normal database authentication.
    * The data in the certificate (name, email addresses etc), as well as the list of signing certificates,
    * should only be trusted if certstrong is true.
    *
    * @param name         Username to authenticate.
    * @param pw           Password to authenticate with.
    * @param certificates List of der encoded certificates the user connected with.
    * @param certhash     Hash of user certificate, as used by murmur internally when matching.
    * @param certstrong   True if certificate was valid and signed by a trusted CA.
    * @param newname      Set this to change the username from the supplied one.
    * @param groups       List of groups on the root channel that the user will be added to for the duration of the connection.
    * @param __current    The Current object for the invocation.
    * @return UserID of authenticated user, -1 for authentication failures and -2 for unknown user (fallthrough).
    **/
  override def authenticate(name: String, pw: String, certificates: Array[Array[Byte]], certhash: String, certstrong: Boolean, newname: StringHolder, groups: GroupNameListHolder, __current: Current): Int = {
    println(s"someone tried to log in with $name and $pw")
    -1
  }

  /**
    * Fetch information about a user. This is used to retrieve information like email address, keyhash etc. If you
    * want murmur to take care of this information itself, simply return false to fall through.
    *
    * @param id        User id.
    * @param info      Information about user. This needs to include at least "name".
    * @param __current The Current object for the invocation.
    * @return true if information is present, false to fall through.
    **/
  override def getInfo(id: Int, info: UserInfoMapHolder, __current: Current): Boolean = false

  /**
    * Map a name to a user id.
    *
    * @param name      Username to map.
    * @param __current The Current object for the invocation.
    * @return User id or -2 for unknown name.
    **/
  override def nameToId(name: String, __current: Current): Int = -2

  /**
    * Map a user id to a username.
    *
    * @param id        User id to map.
    * @param __current The Current object for the invocation.
    * @return Name of user or empty string for unknown id.
    **/
  override def idToName(id: Int, __current: Current): String = ""

  /**
    * Map a user to a custom Texture.
    *
    * @param id        User id to map.
    * @param __current The Current object for the invocation.
    * @return User texture or an empty texture for unknwon users or users without textures.
    **/
  override def idToTexture(id: Int, __current: Current): Array[Byte] = Array.emptyByteArray
}
