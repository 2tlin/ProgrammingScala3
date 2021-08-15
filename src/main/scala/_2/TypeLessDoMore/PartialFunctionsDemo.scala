package _2.TypeLessDoMore

object PartialFunctionsDemo extends App {
  case class Point(x: Double = 0.0, y: Double = 0.0) extends Shape

  abstract class Shape:
    def draw() = println(s"draw: $this")

  case class Circle(center: Point, radius: Double) extends Shape
  case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape
  case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape

  val p0 = Point()
  p0.draw() // draw: Point(0.0,0.0)
  val p2 = Point(2, 2)
  p2.draw() // draw: Point(2.0,2.0)
  val p1 = Point(1)
  p1.draw() // raw: Point(1.0,0.0)


}
