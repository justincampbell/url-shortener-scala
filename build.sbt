name := "url-shortener"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.8",
  "net.databinder" %% "unfiltered-jetty" % "0.6.8",
  "net.databinder" %% "unfiltered-spec" % "0.6.8" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
