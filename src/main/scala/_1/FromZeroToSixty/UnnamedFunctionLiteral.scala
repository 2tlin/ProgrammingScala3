package _1.FromZeroToSixty

object UnnamedFunctionLiteral  {

  class Upper1:
    def convert(strings: Seq[String], func: String => String): Unit =
      strings.map(func).foreach(println)
    end convert

  def main(args: Array[String]): Unit =
    val up = new Upper1()
    // (s: String) => s.toUpperCase() -> Unnamed Function Literal
    val func = (s: String) => s.toUpperCase()
    up.convert(List("i", "like", "scala"), func)

  end main
}
