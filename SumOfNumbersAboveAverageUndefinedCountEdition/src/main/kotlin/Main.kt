fun main() {
    val list = mutableListOf<Int>()
    while (true) {
        var input = readLine()!!
        if (input == "END") break
        var int = input.toInt()
        list += int
    }
    var total = 0
    for (i in 0 until list.size) {
        total += list[i]
    }
    var mean = total.toFloat() / list.size.toFloat()
    var sum = 0
    for (i in 0 until list.size) {
        if (list[i] > mean) sum += list[i]
    }
    println(sum)
}