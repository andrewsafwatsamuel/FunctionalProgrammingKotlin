package calculateDiscountForOrderList

typealias Discount=Pair<(Order)->Boolean,(Order)->Double>

enum class Type{
    FOOD,
    BEVERAGE,
    RAW_MATERIAL
}

data class Order(
    val id: Int,
    val price:Double,
    val weight:Double,
    val quantity:Int,
    val type:Type,
    val discount: Double=0.0
)
