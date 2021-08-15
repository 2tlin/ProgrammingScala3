package _2.TypeLessDoMore

object VariableDeclarations extends App {

  // Variable Declarations
  // A val must be initialized when it is declared,
  // except in certain contexts like abstract fields in type declarations.
  val arrInt: Array[Int] = Array(1,2,3,4,5)
  arrInt(0) = 10
  arrInt.foreach(println)

  val arrString: Array[String] = new Array(5)
  arrString(0) = "Hello Scala 3"
  arrString.foreach(println)

  // Similarly, a mutable variable is declared with the keyword var
  // and it must also be initialized immediately (in most cases),
  // even though it can be changed later

  var stockPrice: Double = 100
  stockPrice = 200
  println(stockPrice)

  /*
  The var and val keywords only specify whether the reference can be changed to refer to a different object (var) or not (val). 
  They don’t specify whether or not the object they reference is mutable.
   */

  class Human(val name: String, var age: Int)
  val p = new Human("Dmitry Vatlin", 55)
  println(s"${p.name} is ${p.age} years old")
  p.age = 56
  println(s"${p.name} is ${p.age} years old")

}
