lazy val root = project.in(file("."))
  .settings(
    name := "dru-de-w4-slick",
    version := "0.1",
    scalaVersion := "2.12.6",

//    wartremoverErrors ++= Warts.unsafe ++ Seq(Wart.Recursion, Wart.While),

    libraryDependencies ++= Seq(
      "com.typesafe.slick" %% "slick" % "3.2.3"
    )
  )
