name := "battlecomms"

version := "1.0"

scalaVersion := "2.12.2"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

val http4sVersion = "0.18.0-M1"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-core",
  "org.http4s" %% "http4s-dsl",
  "org.http4s" %% "http4s-blaze-server"
).map(_ % http4sVersion)
