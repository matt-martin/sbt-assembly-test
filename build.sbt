name := "hello"
version := "1.0"
scalaVersion := "2.11.7"

val shadedPackageName = "shaded.com.example"

lazy val shadeRules = Seq(
  ShadeRule.rename(("com.example.**", "@0")).inProject,       // keep the package the same for internal code
  ShadeRule.rename(("*.**", shadedPackageName + ".@0")).inAll // move all dependencies to the shaded package
)
