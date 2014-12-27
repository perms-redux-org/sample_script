name := "oescript-http"

scalaVersion := Common.scalaVersion
licenses     += Common.license
seq(bintraySettings:_*)

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

