object ScalaStringOperation:
  def main (args:Array[String]):Unit =
    //s-interpolator
    val name = "James"
    println(s"Hello, $name")
    //f-Interpolator
    val height = 1.9d
    val names = "James"
    println(f"$names%s is $height%2.2f meters tall")
    //raw-Interpolator
    println(raw"This is a \n newline")
    val escaped = "This is a \n newline"
    println(raw"$escaped")
    println("------")


