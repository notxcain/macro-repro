name := "macro-repro"

version := "1.0"

scalaOrganization := "org.typelevel"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.aecor" %% "liberator" % "0.3.0-SNAPSHOT"
)

addCompilerPlugin(
  "org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions"
)
