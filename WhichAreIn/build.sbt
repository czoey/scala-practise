ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "whicharein"

lazy val hello = (project in file("."))
  .settings(
    name := "Which Are In",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )