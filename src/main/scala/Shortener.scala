class Shortener {
  var id: Int = 0
  var urlStore: Map[Token, Url] = Map()

  def shorten(url: Url): Token = {
    val token = generateToken
    urlStore += (token -> url)
    token
  }

  def expand(token: Token): Url = {
    urlStore(token)
  }

  def generateToken: Token = {
    id = id + 1
    Token(id.toString)
  }
}
