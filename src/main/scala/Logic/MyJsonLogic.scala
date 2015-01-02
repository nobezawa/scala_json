package Logic
case class Article(id: Int, title: String, description: String)
/**
 * Created by nobesawa on 15/01/01.
 */

import spray.json._
object MyJsonProtocol extends DefaultJsonProtocol {
  implicit val articleFormat = jsonFormat3(Article)
}

class MyJsonLogic {
  import MyJsonProtocol._
  private val articleJson = Article(1, "あけおめ", "今年もよろしくお願いします")
  private val actualJson = articleJson.toJson.compactPrint

  def output: String = {
    actualJson
  }

}
