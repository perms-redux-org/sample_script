import Dependencies._

name := "oescript_core"

scalaVersion := Common.scalaVersion
licenses     += Common.license
seq(bintraySettings:_*)

libraryDependencies ++= core_deps
wartremoverErrors ++= Warts.all

