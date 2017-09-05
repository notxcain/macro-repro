name := "macro-repro"

version := "1.0"

scalaOrganization := "org.typelevel"

scalaVersion := "2.12.3-bin-typelevel-4"

libraryDependencies ++= Seq(
  "io.aecor" %% "liberator" % "0.4.3"
)

addCompilerPlugin(
  "org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.patch)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions"
)
