val delTest1 = ::test1
val delTest2 = ::test2

val delegateList = listOf(delTest1, delTest2)

fun main() {

    println(test2(test1(5.0)))
    println(test1(test2(5.0)))

    println(delegateList[0](5.0))
    println(delegateList[1](5.0))

    println(test3(delTest1, 5.0))
    println(test3(delTest2, 5.0))

}

fun test1(x: Double) = x / 2
fun test2(x: Double) = x / 4 + 1
fun test3(f: (Double) -> Double, double: Double) = f(double) + double
