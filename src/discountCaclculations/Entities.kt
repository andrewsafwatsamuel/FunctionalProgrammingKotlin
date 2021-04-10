package discountCaclculations

typealias OrderParameters = Pair<Double, Double>

enum class ProductType {
    FOOD,
    BEVERAGE,
    RAW_MATERIAL
}

data class Order(
    val id: Int,
    val productIndex: Int,
    val quantity: Int,
    val unitPrice: Double
)