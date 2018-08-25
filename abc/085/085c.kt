fun main(args: Array<String>) {
  val (n, y) = readLine()!!.split(" ").map { it.toInt() }

  for (i in 0..n) {
    for (j in 0..(n - i)) {
      val x = y - i * 10000 - j * 5000
      if (x % 1000 == 0 && x / 1000 == (n - i - j)) {
        println("$i $j ${n - i - j}")
        return
      }
    }
  }

  println("-1 -1 -1")
}
