val logging_lib = "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"

val test_lib = "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

lazy val root = (project in file(".")).
  settings (
    publish := { },
    test := { }
  ).
  aggregate(core, http)

lazy val core = (project in file("core")).
  settings (
    libraryDependencies += logging_lib,
    libraryDependencies += test_lib
  )

lazy val http = (project in file("http")).
  settings (
    libraryDependencies += logging_lib,
    libraryDependencies += test_lib
  ).
  dependsOn(core)

