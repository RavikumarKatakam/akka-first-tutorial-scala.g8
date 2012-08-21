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
      scalaVersion := "$scala_version$",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" % "akka-actor"      % "$akka_version$",
        "com.typesafe.akka" % "akka-testkit"    % "$akka_version$"  % "test",
        "junit"             % "junit"           % "4.10"            % "test",
        "org.scalatest"     % "scalatest_2.10.0-M6" % "1.9-2.10.0-M6-B2" % "test")
    )
  )
}
