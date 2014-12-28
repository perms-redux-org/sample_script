import sbt._
import Keys._

object Common {
    def organization = "onextent"
    def repo_org = "navicore"
    def buildNum = sys.env.getOrElse("TRAVIS_BUILD_NUMBER", default = "0")
    def scalaVersion = "2.11.4"
    def license = ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
}

