publishTo := {
  Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/schleichardt.github.io/jvmrepo"))(Resolver.mavenStylePatterns))
}

publishMavenStyle := true

publishArtifact in Test := false
