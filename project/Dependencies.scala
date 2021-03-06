import sbt._

object Dependencies {

  val akkaVersion      = "2.5.4"
  val catsVersion      = "1.0.0-MF"
  val scalatestVersion = "3.0.4"

  val all = Seq(
    "org.typelevel"     %% "cats-core"           % catsVersion,
    "com.typesafe.akka" %% "akka-stream"         % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion      % Test,
    "org.scalatest"     %% "scalatest"           % scalatestVersion % Test
  )
}