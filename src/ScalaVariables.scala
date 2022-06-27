object ScalaVariables:
  def main (args: Array[String]):Unit =
    val msg = "Hello, world!"
    println(msg)
    var greeting = "Hello, World!"
    println(greeting)
    greeting = "Hello My Name Is Mahmoud"
    println(greeting)
    //infer types
    //with types
    /*val aString: String = "hello"
    val aBoolean: Boolean = false
    val aChar: Char = 'a'
    val aShort: Short = 4613
    val aLong: Long = 5273985273895237L
    val aFloat: Float = 2.0f*/
    //without types
    val aString = "hello"
    val anotherString = "goodbye"
    val aBoolean = false
    val aChar = 'a'
    val aShort = 4613
    val aLong = 5273985273895237L
    val aFloat = 2.0f
