name := "jsdxstockstreamingdataftp"

version := "1.4"

scalaVersion := "2.10.4"

libraryDependencies += "commons-net" % "commons-net" % "3.3"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.6.1"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.5.2"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6" excludeAll ExclusionRule(organization = "javax.servlet")

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.5.2" excludeAll ExclusionRule(organization = "javax.servlet")

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "3.0.0"


assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*) => MergeStrategy.last
  case PathList("javax", "activation", xs @ _*) => MergeStrategy.last
  case PathList("javax", "el", xs @ _*) => MergeStrategy.last
  case PathList("org", "apache", xs @ _*) => MergeStrategy.last
  case PathList("org", "scala-lang", xs @ _*) => MergeStrategy.last
  case PathList("com", "google", xs @ _*) => MergeStrategy.last
  case PathList("com", "esotericsoftware", xs @ _*) => MergeStrategy.last
  case PathList("com", "codahale", xs @ _*) => MergeStrategy.last
  case PathList("com", "yammer", xs @ _*) => MergeStrategy.last
  case "about.html" => MergeStrategy.rename
  case "META-INF/ECLIPSEF.RSA" => MergeStrategy.last
  case "META-INF/mailcap" => MergeStrategy.last
  case "META-INF/mimetypes.default" => MergeStrategy.last
  case "plugin.properties" => MergeStrategy.last
  case "log4j.properties" => MergeStrategy.last
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
