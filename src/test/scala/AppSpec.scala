import org.specs._
import dispatch.classic.Http
import dispatch.classic.Request
import dispatch.StatusCode

object AppSpec extends Specification with unfiltered.spec.jetty.Served {
  def setup = _.filter(new App)

  val http = new Http

  "GET /" should {
    "redirect to the documentation" in {
      val status = http.x(host) { case (code, _, _) => code }

      // status must be equalTo(302)
    }
  }

  def teardown = {
    http.shutdown
  }
}
