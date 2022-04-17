ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "jga.example"

lazy val hello =
  project
    .in(file("."))
    .settings(
      name := "hello",
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
    )


