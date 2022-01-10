lazy val fs2V        = "3.2.4"
lazy val catsEffectV = "3.3.4"
lazy val log4j2V     = "2.17.0"
lazy val scalatestV  = "3.2.10"
lazy val scalacheckV = "3.2.10.0"

lazy val `dive-into-effect` = (project in file(".")).settings(
  name         := "dive-into-effect",
  version      := "0.1.0-SNAPSHOT",
  scalaVersion := "3.1.1-RC1",
  organization := "info.galudisu",
  homepage     := Some(url("https://github.com/barudisshu/dive-into-effect")),
  licenses     := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "barudisshu",
      "Galudisu",
      "galudisu@gmail.com",
      url("https://galudisu.info")
    )
  ),
  libraryDependencies ++= Seq(
    // fs2
    "co.fs2" %% "fs2-core"             % fs2V,
    "co.fs2" %% "fs2-io"               % fs2V,
    "co.fs2" %% "fs2-reactive-streams" % fs2V,
    "co.fs2" %% "fs2-scodec"           % fs2V,
    // log4j2
    "org.apache.logging.log4j" % "log4j-api"        % log4j2V,
    "org.apache.logging.log4j" % "log4j-core"       % log4j2V,
    "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4j2V,
    // test
    "org.typelevel"     %% "cats-effect-testkit" % catsEffectV % Test,
    "org.scalatest"     %% "scalatest"           % scalatestV  % Test,
    "org.scalatestplus" %% "scalacheck-1-15"     % scalacheckV % Test
  )
)
