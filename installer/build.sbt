seq(WebStartPlugin.allSettings:_*)

webstartMainClass   := "conscript.Installer"

webstartJnlpConf    := JnlpConf(
    fileName        = "conscript.jnlp",
    codeBase        = "http://my.test/webstart/",
    title           = "Conscript Installer",
    vendor          = "duh",
    description     = "Installer for conscript, a command line tool installer for Scala",
    offlineAllowed  = true,
    allPermissions  = true,
    j2seVersion     = "1.6+",
    maxHeapSize     = 192
)

libraryDependencies += "org.scala-lang" % "scala-swing" % "2.8.1"