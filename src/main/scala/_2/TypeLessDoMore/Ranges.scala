package _2.TypeLessDoMore
import scala.collection.immutable.NumericRange

object Ranges extends App {
  var r1: NumericRange.Inclusive[BigDecimal] = BigDecimal(1.1) to BigDecimal(10.4) by 3.1
  r1.foreach(println)
  val r2: NumericRange.Exclusive[BigDecimal] = BigDecimal(1.1) until  BigDecimal(10.4) by 3.1
  r2.foreach(println)
}
