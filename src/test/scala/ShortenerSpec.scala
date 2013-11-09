import org.scalatest.BeforeAndAfter
import org.scalatest.FreeSpec

class ShortenerSpec extends FreeSpec with BeforeAndAfter {
  var shortener: Shortener = null

  before {
    shortener = new Shortener
  }

  "shortener" - {
    "shortens a url into a token" in {
      val url = Url("http://justincampbell.me")
      assert(shortener.shorten(url).isInstanceOf[Token])
    }

    "shortens and expands a url" in {
      val url = Url("http://justincampbell.me")
      val token = shortener.shorten(url)

      assert(shortener.expand(token) === url)
    }

    "shortens and expands multiple urls" in {
      val url = Url("http://justincampbell.me")
      val url2 = Url("http://google.com")

      val token = shortener.shorten(url)
      val token2 = shortener.shorten(url2)

      assert(token != token2)

      assert(shortener.expand(token) === url)
      assert(shortener.expand(token2) === url2)
    }
  }
}

