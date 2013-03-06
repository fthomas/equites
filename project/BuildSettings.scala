import sbt._
import Keys._

import org.scalastyle.sbt.ScalastylePlugin

object BuildSettings {
  lazy val basicSettings =
    ScalastylePlugin.Settings ++
    seq(
      scalaVersion := "2.10.0",
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature"),

      homepage := Some(url("http://equites.timepit.eu")),
      startYear := Some(2011),
      licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html")
    )

  lazy val coreSettings = basicSettings ++ seq(
    initialCommands := """
      import scalaz._
      import Scalaz._
      import eu.timepit.equites._
      """
  )
}
