fun main(args: Array<String>) {
  val s = readLine()!!
  var count = 0
  for (i in 0 until s.length) {
    if (s.get(i) == '1') {
      count++
    }
  }
  println(count)
}
