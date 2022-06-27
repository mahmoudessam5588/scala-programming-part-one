object CallByNameOrByValue:
  def main (args: Array[String]):Unit =
    def calledByValue(x: Long): Unit =
      println("by value: " + x)
      println("by value: " + x)
    calledByValue(1257387745764245L)
    def calledByName(x: => Long): Unit =
      println("by name: " + x)
      println("by name: " + x)
    calledByName(System.nanoTime())
