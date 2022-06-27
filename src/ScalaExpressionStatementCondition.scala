object ScalaExpressionStatementCondition:
  def main (args:Array[String]):Unit =
    val x = 1 + 2 // EXPRESSION
    println(x) // 3
    println(1 + 2 * 3) // 7 multiplication first then addition
    println((1+2)*3) //9
    println(1 == x) //false
    println(!(1 == x)) //true
    //var with side effects
    var aVariable = 2
    aVariable += 3 // also works with -= *= /= ..... side effects
    println(aVariable)
    //if expression
    val aCondition = true
    println(if aCondition then 5 else 3)
    //expression block
    val aCodeBlock =
      val y = 2
      val z = y + 1
      if z > 2 then "hello" else "goodbye"
