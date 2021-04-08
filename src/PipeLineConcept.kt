val myData = listOf(7, 4, 5, 6, 3, 8, 10)


fun main() {
    myData
        .asSequence()
        .map(::addOne)
        .map(::square)
        .filter { it<70 }
        .sorted()
        .take(2)
        .map(::subtractTen)
        .toList()
        .forEach { println(it) }
}

fun subtractTen(num: Int) = num.minus(10)

fun square(num: Int) = num * num

fun addOne(num: Int) = num + 1