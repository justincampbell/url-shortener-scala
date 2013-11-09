import org.scalatest.FreeSpec

class TokenSpec extends FreeSpec {
  "token" - {
    "stores a token" in {
      val token = Token("1")
      assert(token.toString === "1")
    }
  }
}
