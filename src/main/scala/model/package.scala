import java.time.LocalDateTime

package object model {

  case class Shop(id: Long, name: String, address: String)

  case class Cashier(id: Long, name: String)

  case class Customer(id: Long, name: String)

  case class Good(id: Long, name: String, price: Double)

  case class Check(id: Long,
                   dateTime: LocalDateTime,
                   shopId: Long,
                   customerId: Long,
                   cashierId: Long)

  case class GoodsToCheck(goodId: Long,
                          checkId: Long,
                          count: Int,
                          price: Double)
}
