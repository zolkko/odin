// val corenlpVersion = "4.4.0"
val corenlpVersion = "3.5.1"

name := "processors-corenlp"

libraryDependencies ++= {
  Seq(
    "edu.stanford.nlp" % "stanford-corenlp" % corenlpVersion,
    "edu.stanford.nlp" % "stanford-corenlp" % corenlpVersion classifier "models"
  )
}
