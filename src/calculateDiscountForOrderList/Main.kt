package calculateDiscountForOrderList

private val ordersForProcessing = listOf(
    Order(10,1100.0,20.0,20,Type.FOOD),
    Order(12,100.0,5.0,8,Type.RAW_MATERIAL)
)

val getDiscountRules = listOf(
    Pair(::isQuantityQualified, ::calculateQuantityDiscount),
    Pair(::isPriceQualified, ::calculatePriceDiscount),
    Pair(::isWeightQualified, ::calculateWeightDiscount),
    Pair(::isTypeFood, ::calculateFoodDiscount),
    Pair(::isTypeBeverage, ::calculateBeverageDiscount),
    Pair(::isTypeRaw, ::calculateRawDiscount)
)

fun main() {
    ordersForProcessing
        .map { getOrderWithDiscount(it, getDiscountRules) }
        .forEach { println(it.toString()) }
}


fun getOrderWithDiscount(order: Order, rules: List<Discount>): Order = rules
    .asSequence()
    .filter { it.first(order) }
    .map { it.second(order) }
    .sorted()
    .take(3)
    .average()
    .let { order setDiscount it }

infix fun Order.setDiscount(discount: Double) = Order(id, price, weight, quantity, type, discount)

fun isQuantityQualified(order: Order) = order.quantity > 10
fun calculateQuantityDiscount(order: Order) = (order.price / 100).times(7)

fun isPriceQualified(order: Order) = order.price > 1000
fun calculatePriceDiscount(order: Order) = (order.price / 100).times(10)

fun isWeightQualified(order: Order) = order.weight>10
fun calculateWeightDiscount(order: Order) = (order.price / 100).times(3)

fun isTypeFood(order: Order)=order.type == Type.FOOD
fun calculateFoodDiscount(order: Order) = (order.price / 100).times(15)

fun isTypeRaw(order: Order)=order.type == Type.RAW_MATERIAL
fun calculateRawDiscount(order: Order) = (order.price / 100).times(12)

fun isTypeBeverage(order: Order)=order.type == Type.BEVERAGE
fun calculateBeverageDiscount(order: Order) = (order.price / 100).times(30)