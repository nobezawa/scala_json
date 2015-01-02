import Model.articleModel
import Logic.MyJsonLogic
import java.io._
/**
 * Created by nobesawa on 14/12/30.
 */
object Main {
  def main(args: Array[String]) = {
    val article = new articleModel
    //article.article_select()
    val myJson = new MyJsonLogic
    val file = new PrintWriter(new File("/Users/nobesawa/hoge.json"))
    file.write(myJson.output)
    file.close()
  }

}
