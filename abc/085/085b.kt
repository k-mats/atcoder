fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val d = Array<Boolean>(100, { false })

  repeat(n) {
    val x = readLine()!!.toInt()
    d[x - 1] = true
  }

  var count = d.map { it.toInt() }.reduce { sum, element -> sum + element }
  println(count)
}

fun Boolean.toInt() = if (this) 1 else 0
