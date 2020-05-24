name := "funcCats"

version := "0.1"

scalaVersion := "2.13.2"

lazy val common = (project in file("."))
  .enablePlugins(ScalafmtPlugin)
  .enablePlugins(AssemblyPlugin)
  .settings(
    name := "sHolder",
    scalacOptions ++= Seq(
      "-feature",
      "-language:implicitConversions",
      "-language:higherKinds"
    ),
    mainClass in (Compile, run) := Some("company.ryzhkov.Application"),
    mainClass in (assembly) := Some("company.ryzhkov.Application"),
    assemblyJarName in assembly := "server.jar"
  )
