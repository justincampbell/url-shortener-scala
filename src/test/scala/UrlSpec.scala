import org.scalatest.FreeSpec

class UrlSpec extends FreeSpec {
  "url" - {
    "stores a url" in {
      val url = Url("http://justincampbell.me")
      assert(url.toString === "http://justincampbell.me")
    }
  }
}
