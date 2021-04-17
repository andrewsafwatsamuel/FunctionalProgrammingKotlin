package orderCostExample

val configuration = ProcessConfiguration(
    ShippingDateChoice.SHIP_DATE1,
    InvoiceChoice.INV1,
    FreightChoice.FR1,
    ShippingChoice.SHIP1,
    AvailabilityChoice.AV1
)
val invoicePath = invoicePath(configuration)
val availabilityPath = availabilityPath(configuration)
val calcAdjustedCostForOrder = adjustCoast(invoicePath, availabilityPath)

fun main() {
    calcAdjustedCostForOrder(Order(Unit)).also(::println)
}