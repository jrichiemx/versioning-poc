name := """versioning-poc"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

resolvers += "emueller-bintray" at "http://dl.bintray.com/emueller/maven"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.eclipsesource" %% "play-json-schema-validator" % "0.8.5",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "default" %% "shchema-publish" % "1.0"
)
