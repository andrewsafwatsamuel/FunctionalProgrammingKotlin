package orderCostExample

fun adjustCoast(
    freightCoast: (Order) -> FreightCost,
    shippingDate: (Order) -> ShippingDate
): (Order) -> Double = { 0.0 }

fun inv1(order: Order)=Invoice(Unit)
fun inv2(order: Order)=Invoice(Unit)

fun ship1(invoice: Invoice)=Shipping(Unit)
fun ship2(invoice: Invoice)=Shipping(Unit)

fun fr1(shipping: Shipping)=FreightCost(Unit)
fun fr2(shipping: Shipping)=FreightCost(Unit)

fun av1(order: Order)=Availability(Unit)
fun av2(order: Order)=Availability(Unit)

fun shipDate1(availability: Availability) = ShippingDate(Unit)
fun shipDate2(availability: Availability) = ShippingDate(Unit)