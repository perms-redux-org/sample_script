lazy val root = (project in file(".")).
  aggregate(core, http)

lazy val core = (project in file("core"))

lazy val http = (project in file("http")).
  dependsOn(core)

