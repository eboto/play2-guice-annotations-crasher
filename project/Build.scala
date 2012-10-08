import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-guice-annotations-crasher"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.cedarsoft" % "guice-annotations" % "2.0.1",
      "org.jclouds" % "jclouds-blobstore" % "1.5.1",
      "org.jclouds.api" % "filesystem" % "1.5.1",
      "org.jclouds.provider" % "aws-s3" % "1.5.1"      
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
