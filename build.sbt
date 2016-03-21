name := "NewNotes"

version := "1.0"

lazy val `newnotes` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

libraryDependencies += "com.google.api-client" % "google-api-client" % "1.20.0"

libraryDependencies += "com.google.oauth-client" % "google-oauth-client-jetty" % "1.20.0"

libraryDependencies += "com.google.apis" % "google-api-services-calendar" % "v3-rev125-1.20.0"

libraryDependencies += "junit" % "junit" % "4.12"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  