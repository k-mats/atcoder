fun main(args: Array<String>) {
  var s = readLine()!!

  var i = s.length

  while (i >= 0) {
    // erase or dream
    if (i >= 5) {
      val sub5 = s.substring(i - 5, i)
      if (sub5 == "erase" || sub5 == "dream") {
        s = s.substring(0, i - 5)
        i -= 5
        continue
      }
    }
    // eraser
    if (i >= 6) {
      val sub6 = s.substring(i - 6, i)
      if (sub6 == "eraser") {
        s = s.substring(0, i - 6)
        i -= 6
        continue
      }
    }
    // dreamer
    if (i >= 7) {
      val sub7 = s.substring(i - 7, i)
      if (sub7 == "dreamer") {
        s = s.substring(0, i - 7)
        i -= 7
        continue
      }
    }

    if (s == "") {
      println("YES")
      return
    } else {
      println("NO")
      return
    }
  }
}
