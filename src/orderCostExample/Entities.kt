package orderCostExample

typealias InvoiceConfig = Map<InvoiceChoice, (Order) -> Invoice>
typealias ShippingConfig = Map<ShippingChoice, (Invoice) -> Shipping>
typealias FreightConfig = Map<FreightChoice, (Shipping) -> FreightCost>
typealias AvailabilityConfig = Map<AvailabilityChoice, (Order) -> Availability>
typealias ShippingDateConfig = Map<ShippingDateChoice,(Availability)->ShippingDate>


enum class ShippingDateChoice{
    SHIP_DATE1,
    SHIP_DATE2,
}
enum class InvoiceChoice{
    INV1,
    INV2
}
enum class FreightChoice{
    FR1,
    FR2
}
enum class ShippingChoice{
    SHIP1,
    SHIP2
}
enum class AvailabilityChoice{
    AV1,
    AV2
}

data class ProcessConfiguration(
    val shippingDateChoice: ShippingDateChoice,
    val invoiceChoice: InvoiceChoice,
    val freightChoice: FreightChoice,
    val shippingChoice: ShippingChoice,
    val availabilityChoice: AvailabilityChoice
)

data class Order(val hello: Unit)
data class Invoice(val hello: Unit)
data class Shipping(val hello: Unit)
data class FreightCost(val hello: Unit)
data class Availability(val hello: Unit)
data class ShippingDate(val hello: Unit)
