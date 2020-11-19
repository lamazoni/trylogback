lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-hello-world-tutorial""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.5",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.10.5",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.10.5",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "ch.qos.logback" % "logback-access" % "1.1.3",
      "net.logstash.logback" % "logstash-logback-encoder" % "4.5.1",
      "ch.qos.logback" % "logback-classic" % "1.1.3" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
