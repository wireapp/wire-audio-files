name := "audio-notifications"
organization := "com.wire"
version := "1.195.0"
crossPaths := false
scalaVersion := "2.11.8"

javacOptions in ThisBuild ++= Seq("-source", "1.7", "-target", "1.7", "-encoding", "UTF-8")
scalacOptions in ThisBuild ++= Seq("-target:jvm-1.7", "-encoding", "UTF-8")

android.Plugin.androidBuildAar
platformTarget := "android-23"

bintrayOmitLicense := true
bintrayOrganization := Some("wire-android")
bintrayRepository := "releases"

