import scala.language.postfixOps

object ScalaFunctionDefinitionAndSyntax:
  def main (args: Array[String]):Unit =
    def biggerThan (x:Int , y:Int):Int =
      if x > y then x else y
    biggerThan(7,4)
  //Exercise consider you have a collection of numbers you don't know how large or small it's and you only want to filter the even numbers
    def aCollection(evenNum:LazyList[Int]):LazyList[Int]=
      for x <- evenNum if x % 2 == 0 yield x
    aCollection(LazyList(2,3,4,6,7)) foreach println
    //Another Solution Less Optimized For Large Collections but Shorter Syntax
    val numbers: IndexedSeq[Int] = for i:Int <- 1 to 10 filter(_%2==0) yield i
    numbers foreach println
    println(numbers toList)



