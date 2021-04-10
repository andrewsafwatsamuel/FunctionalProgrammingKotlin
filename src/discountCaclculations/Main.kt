package discountCaclculations

val foodParameters = ::calculateFoodParameters
val beverageParameters = ::calculateBeverageParameters
val rawMaterialParameters = ::calculateRawMaterialParameters
val order = Order(10, 100, 20, 4.0)

fun main() {
    val product = ProductType.RAW_MATERIAL
    val p = when (product) {
        ProductType.FOOD -> foodParameters
        ProductType.BEVERAGE -> beverageParameters
        else -> rawMaterialParameters
    }
    println(calculateDiscount(p, order))
}

fun calculateDiscount(
    productParameterCalculations: (Int) -> OrderParameters,
    order: Order
): Double = productParameterCalculations(order.productIndex)
    .run { first.times(order.quantity) + second.times(order.unitPrice) }

fun calculateFoodParameters(index: Int): OrderParameters =
    Pair(index / (index + 100).toDouble(), index / (index + 300).toDouble())

fun calculateBeverageParameters(index: Int): OrderParameters =
    Pair(index / (index + 300).toDouble(), index / (index + 400).toDouble())

fun calculateRawMaterialParameters(index: Int): OrderParameters =
    Pair(index / (index + 700).toDouble(), index / (index + 700).toDouble())