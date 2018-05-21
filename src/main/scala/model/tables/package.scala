package model

import slick.jdbc.PostgresProfile.api._

package object tables {
class ShopTable(tag: Tag) extends Table[Shop](tag, "shops"){
  val id: Rep[Long] = column[Long]("id")
  val name: Rep[String] = column[String]("name")
  val address: Rep[String] = column[String]("address")

  def * =
    (id, name, address) <> ((Shop.apply _).tupled, Shop.unapply)
}

  object ShopTable{
    val query = TableQuery[ShopTable]

    val q1 = query.filter(_.name === "Ah\"san").result

    val q2 = """select "id", "name", "address" from "shops" where "name" = 'Ahsan'"""
  }
}
