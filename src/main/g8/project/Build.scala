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
      // FIXME: "scalaBinaryVersion" is only needed for Scala Milestones
      scalaBinaryVersion in Global := "$scala_version$",
      resolvers ++= Seq("Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor"      % "$akka_version$",
        "com.typesafe.akka" %% "akka-testkit"    % "$akka_version$"   % "test",
        "junit"             % "junit"            % "4.10"             % "test",
        // FIXME: convert to %% when scalatest is published correctly
        "org.scalatest"     % "scalatest"        % "1.9-2.10.0-M7-B1" % "test" cross CrossVersion.full)
    )
  )
}
