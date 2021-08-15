package _1.FromZeroToSixty

object SampleApplication extends App {
  /*
   The Point.apply method is effectively a factory for constructing Points.
   The companion object generated is equivalent to this:
   object Point {
      def apply(x: Double = 0.0, y: Double = 0.0) = new Point(x, y)
      ...
    }
   */
  object Point:
    def apply(x: Double = 0.0, y: Double = 0.0) =
      print(s"Hello new apply method with $x and $y\n")
      new Point(x, y)
    end apply

  case class Point(x: Double = 0.0, y: Double = 0.0) extends Shape

  abstract class Shape:
    def draw() = println(s"draw: $this")

  /*
  The last feature of case classes that we’ll mention now is that the compiler also generates a companion object,
  a “singleton” of the same name, for each case class.
  You can define companions yourself. Any time an object and a class have the same name and they are defined in the same file,
  they are companions.
   */
  case class Circle(center: Point, radius: Double) extends Shape
  case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape
  case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape

  val p0 = Point()
  p0.draw() // draw: Point(0.0,0.0)
  val p2 = Point(2, 2)
  p2.draw() // draw: Point(2.0,2.0)
  val p1 = Point(1)
  p1.draw() // raw: Point(1.0,0.0)
  val p3 = Point.apply(3, 3)
  p3.draw()
  val tr1 = Triangle(p0, p1, p3)
  tr1.draw()

}
