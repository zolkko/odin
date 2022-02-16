lazy val commonSettings = Seq(
  organization := "org.clulab",
  scalaVersion := "2.12.15",
  scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")
)

lazy val processors = (project in file("."))
  .settings(commonSettings)
  .aggregate(main, odin, corenlp, modelsmain, modelscorenlp, openie)
  .dependsOn(main, odin, corenlp, modelsmain, modelscorenlp, openie) // so that we can import from the console

lazy val main = project
  .settings(commonSettings)
  .dependsOn(modelsmain % "test")

lazy val odin = project
  .settings(commonSettings)
  .dependsOn(main % "test->test;compile->compile")

lazy val corenlp = project
  .settings(commonSettings)
  .dependsOn(main % "test->test;compile->compile", modelscorenlp)

lazy val modelsmain = project
  .settings(commonSettings)

lazy val modelscorenlp = project
  .settings(commonSettings)

lazy val openie = project
  .settings(commonSettings)
  .dependsOn(main % "test->test;compile->compile", odin)
