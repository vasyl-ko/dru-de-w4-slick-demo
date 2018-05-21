import slick.lifted.Tag

import slick.jdbc.PostgresProfile.api._

import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  def main(arg: Array[String]): Unit = {
    model.tables.ShopTable.q1.statements.foreach(println)
  }
}
