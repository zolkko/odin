name := "processors-main"

libraryDependencies ++= {
  val akkaV = "2.6.18"
  val json4sVersion = "4.0.3"

  Seq(
    // common tools
    "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.0",
    "com.typesafe"           % "config"                    % "1.4.2",
    "com.io7m.xom"           % "xom"                       % "1.2.10",
    "org.json4s"             %% "json4s-core"              % json4sVersion,
    "org.json4s"             %% "json4s-jackson"           % json4sVersion,
    "ai.lum"                 %% "common"                   % "0.0.8", // 0.1.5
    "jline"                  % "jline"                     % "2.14.6", // was moved to org.jline
    "commons-io"             % "commons-io"                % "2.11.0",
    // for machine learning
    "de.bwaldvogel"   % "liblinear" % "1.94",
    "tw.edu.ntu.csie" % "libsvm"    % "3.17",
    // NLP tools used by CluProcessor
    "edu.washington.cs.knowitall.nlptools" % "nlptools-stem-morpha_2.10" % "2.4.5", // for lemmatization
    "org.antlr"                            % "antlr4-runtime"            % "4.6", // for tokenization
    "org.maltparser"                       % "maltparser"                % "1.9.0", // for dependency parsing
    "org.clulab"                           % "bioresources"              % "1.1.24", // for bio NER

    // logging
    "com.typesafe.scala-logging" %% "scala-logging"  % "3.9.4",
    "ch.qos.logback"             % "logback-classic" % "1.2.10",
    "org.slf4j"                  % "slf4j-api"       % "1.7.36",
    // AKKA
    "com.typesafe.akka" %% "akka-actor"  % akkaV,
    "com.typesafe.akka" %% "akka-remote" % akkaV,
    "com.typesafe.akka" %% "akka-slf4j"  % akkaV,
    // testing
    "org.scalatest"     %% "scalatest"    % "3.2.11" % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaV    % "test"
  )

}
// dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.0"
