fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()

  var answer = 0
  for (i in 0 until n) {
    if (i % 2 == 0) {
      answer += a.get(i)
    } else {
      answer -= a.get(i)
    }
  }

  println(answer)
}
