
name := "scala-spark-best-practice"

version := "0.1"

scalaVersion := "2.11.8"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
val sparkV = "2.3.0"


//enablePlugins(JavaServerAppPackaging)

resolvers += Resolver.jcenterRepo
resolvers += "Local Repository" at "file://" + Path.userHome.absolutePath + "/.ivy2/local"
resolvers += Resolver.sbtPluginRepo("releases")

//resolvers ++= Seq(
//  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
//)

//
resolvers in ThisBuild ++= Seq("bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/",
  "repo1" at "https://repo1.maven.org/maven2/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
)

aggregate in runMain := true
retrieveManaged := true
publishMavenStyle := true

credentials += sbt.Credentials(Path.userHome / ".ivy2" / ".credentials.cai")

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"



libraryDependencies ++= Seq(
  // pip 와 같이 필요한 패키지를 사전에 선언하는 곳
  // 이곳에 선언되어 있지 않은 패키지는 사용될 수 없다

  "org.slf4j" % "slf4j-api" % "1.7.25",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.apache.hadoop" % "hadoop-client" % "3.0.0",

  "org.json4s" %% "json4s-jackson" % "3.5.3" force(),
  "org.json4s" %% "json4s-native" % "3.5.3" force(),
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "com.typesafe.play" %% "play" % "2.5.12",

  //local running
  //  "org.apache.spark" %% "spark-core" % sparkV % "provided",
  //  "org.apache.spark" %% "spark-streaming" % sparkV % "provided",
  //  "org.apache.spark" %% "spark-sql" % sparkV % "provided",
  //  "org.apache.spark" %% "spark-mllib" % sparkV % "provided",
  //  "org.apache.spark" %% "spark-repl" % sparkV % "provided",
  //  "org.apache.spark" %% "spark-yarn" % sparkV % "provided",

  // remote running
  "org.apache.spark" %% "spark-core" % sparkV,
  "org.apache.spark" %% "spark-streaming" % sparkV,
  "org.apache.spark" %% "spark-sql" % sparkV,
  "org.apache.spark" %% "spark-mllib" % sparkV,
  "org.apache.spark" %% "spark-repl" % sparkV,
  "org.apache.spark" %% "spark-yarn" % sparkV)
