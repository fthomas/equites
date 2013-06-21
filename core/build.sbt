name := "Equites-core"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
    "org.scalaz" % "scalaz-core_2.10" % "7+"
)

scalacOptions in (Compile, doc) ++= Seq("-diagrams")

scalacOptions in (Compile, doc) <++= baseDirectory.map {
  (bd: File) => Seq[String](
     "-sourcepath", bd.getAbsolutePath,
     "-doc-source-url", "https://github.com/fthomas/equites/tree/master/core€{FILE_PATH}.scala"
  )
}

seq(ScctPlugin.instrumentSettings : _*)
