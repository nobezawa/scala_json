name := "scala_json"

version := "1.0"

scalaVersion := "2.11.4"


libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.28",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "io.spray" %%  "spray-json" % "1.3.1"
)

scalariformSettings