fun main(args: Array<String>) {
  val n = readLine()!!.toInt()

  var pt = 0
  var px = 0
  var py = 0
  repeat(n) {
    val (t, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val distance = (x - px).abs() + (y - py).abs()
    val dt = t - pt
    if (distance <= dt && distance % 2 == dt % 2) {
      pt = t
      px = x
      py = y
    } else {
      println("No")
      return
    }
  }

  println("Yes")
}

fun Int.abs() = if (this < 0) this * -1 else this
