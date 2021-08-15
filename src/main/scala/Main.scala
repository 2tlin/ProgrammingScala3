@main
def hello: Unit =
  println("Hello world!")
  println(msg)

  val seq = 1 to 10
  var i = 0
  while i <= seq.length do
    println(i)
    i += 1
  end while
  if i > seq.length then
    println(s"last i = $i")
  end if
end hello

def msg = "I was compiled by Scala 3. :)"
