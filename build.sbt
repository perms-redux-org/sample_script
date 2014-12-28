import com.typesafe.sbt.SbtGit._
versionWithGit
git.baseVersion := "0.1"

lazy val root = (project in file(".")).
  settings (
    publish := { },
    test := { }
  ).
  aggregate(core, http)

lazy val core = (project in file("core"))
lazy val http = (project in file("http")).
  dependsOn(core)

