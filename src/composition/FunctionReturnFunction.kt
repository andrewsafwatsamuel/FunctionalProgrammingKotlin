package composition

val myData = listOf(3.0, 5.0, 7.0, 8.0)

fun main() {
    val subtractTenDlgt = ::subtractTen
    val addOneDlgt = ::addOne
    val squareDlgt = ::square
    val composeDlgt = addOneDlgt.compose(squareDlgt).compose(subtractTenDlgt)
    myData
        .map(composeDlgt)
        .forEach(::println)
}

fun <T1, T2, T3> ((T1) -> T2).compose(
    second: (T2) -> T3
): (T1) -> T3 = { second(this(it)) }

fun subtractTen(num: Double) = num.minus(10)

fun square(num: Double) = num * num

fun addOne(num: Double) = num + 1