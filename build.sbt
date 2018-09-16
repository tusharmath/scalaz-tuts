ThisBuild / scalaVersion := "2.12.6"

// set the Scala version used for the project
ThisBuild / version := "0.1.0-SNAPSHOT"

scalaSource in Compile := baseDirectory.value / "src"
scalaSource in Test := baseDirectory.value / "test"

// dependencies
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.26"
