import Dependencies._

name := "oescript_http"

scalaVersion := Common.scalaVersion
licenses     += Common.license
seq(bintraySettings:_*)

libraryDependencies ++= core_deps
wartremoverErrors ++= Warts.all

import DockerKeys._
import sbtdocker.mutable.Dockerfile
import sbtdocker.ImageName

dockerfile in docker := {
  val artifact = (outputPath in assembly).value
  val artifactTargetPath = s"/app/${artifact.name}"
  new Dockerfile {
    from("pallet/ubuntu-nodoc")
    env("DEBIAN_FRONTEND","noninteractive")
    run("apt-get", "install", "-y", "--no-install-recommends", "openjdk-7-jre-headless")
    run("apt-get", "-y", "autoremove")
    run("apt-get", "-y", "autoclean")
    run("apt-get", "-y", "clean")
    add(artifact, artifactTargetPath)
    entryPoint("java", "-jar", artifactTargetPath)
  }
}

dockerSettings
docker <<= (docker dependsOn assembly)

imageName in docker := {
  ImageName(
  namespace = Some(Common.repo_org),
  repository = name.value,
  tag = Some("v" + version.value))
}

