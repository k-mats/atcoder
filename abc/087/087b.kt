fun main(args: Array<String>) {
  val a = readLine()!!.toInt()
  val b = readLine()!!.toInt()
  val c = readLine()!!.toInt()
  val x = readLine()!!.toInt()

  var count = 0
  for (i in 0..a) {
    for (j in 0..b) {
      val y = x - 500 * i - 100 * j
      if (y % 50 == 0 && y / 50 <= c && y / 50 >= 0) {
        count++
      }
    }
  }

  println(count)
}
