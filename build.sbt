name := "LineCount"

version := "1.0"

scalaVersion := "2.10.6"

resolvers += "Hortonworks Releases" at "http://repo.hortonworks.com/content/groups/public"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.3.2.6.4.0-91"
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "2.7.3.2.6.4.0-91"
