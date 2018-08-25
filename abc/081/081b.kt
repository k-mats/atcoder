fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(" ").map { it.toInt() }

  var min = Int.MAX_VALUE
  a.forEach {
    if (it % 2 == 1) {
      println(0)
      return
    }

    var num = it
    var count = 0
    while (num % 2 == 0) {
      count++
      num /= 2
    }
    if (count < min) {
      min = count
    }
  }

  println(min)
}
