import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "2.9.1",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" % "akka-actor"      % "$akka_version$",
        "com.typesafe.akka" % "akka-testkit"    % "$akka_version$"  % "test",
        "junit"             % "junit"           % "4.5"             % "test",
        "org.scalatest"     % "scalatest_2.9.0" % "1.6.1"           % "test")
    )
  )
}
