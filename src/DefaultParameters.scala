object DefaultParameters:
  def main (args :Array[String]):Unit=
    def log(message: String, level: String = "INFO"): Unit = println(s"$level: $message")
    log("System starting")  // prints INFO: System starting
    log("User not found", "WARNING")  // prints WARNING: User not found
