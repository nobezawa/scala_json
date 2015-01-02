package Model

import scala.slick.jdbc._
import scala.slick.driver.MySQLDriver.simple._

/**
 * Created by nobesawa on 15/01/01.
 */
class articleModel {

  class Article(tag: Tag) extends Table[(Int, String, String)](tag, "articles") {
    def id = column[Int]("id", O.PrimaryKey)
    def title = column[String]("title")
    def description = column[String]("description")
    def * = (id, title, description)
  }

  val articles = TableQuery[Article]

  def article_select() = {
    Database.forURL("jdbc:mysql://localhost/scala_test?user=root&password=",
      driver = "com.mysql.jdbc.Driver") withSession {
        implicit session =>
          //DBアクセスコードはここへ記
          articles foreach {
            case (id, title, description) =>
              println("  " + id + " " + title + " " + description)
          }
      }
  }

}
