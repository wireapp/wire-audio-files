name := "audio-notifications"
organization := "com.wire"
version := "1.195.0"
crossPaths := false
scalaVersion := "2.11.8"

android.Plugin.androidBuildAar
platformTarget := "android-23"

bintrayOmitLicense := true
bintrayOrganization := Some("wire-android")
bintrayRepository := "releases"

