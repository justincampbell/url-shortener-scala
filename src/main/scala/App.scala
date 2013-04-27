import unfiltered.request._
import unfiltered.response._

class App extends unfiltered.filter.Plan {
  import QParams._

  def intent = {
    case GET(Path("/test")) =>
      ResponseString("test")
  }
}

object Server {
  def main(args: Array[String]) {
    val http = unfiltered.jetty.Http.anylocal
    val app = new App

    http.filter(app).run()
  }
}
