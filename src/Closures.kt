fun main() {
    val basicSalaryCategories = mapOf(
        Pair('a', 1000.0),
        Pair('b', 2000.0),
        Pair('c', 3000.0)
    )

    val grossSalaryCalculators = basicSalaryCategories
        .asSequence()
        .map { Pair(it.key, grossSalaryCalculator(it.value)) }
        .toMap()

    println(grossSalaryCalculators['a']?.invoke(10.0))

    println(grossSalaryCalculators['b']?.invoke(10.0))

    println(grossSalaryCalculators['c']?.invoke(10.0))
}

fun grossSalaryCalculator(basicSalary: Double): (Double) -> Double {
    val tax: Double = 0.2 * basicSalary
    return { bonus -> bonus + tax + basicSalary }
}