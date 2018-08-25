fun main(args: Array<String>) {
  val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
  var answer = 0

  for (i in 1..n) {
    var x = i
    var sum = 0
    while (x > 0) {
      sum += (x - (x / 10 * 10))
      x /= 10
    }
    if (sum >= a && sum <= b) {
      answer += i
    }
  }

  println(answer)
}
