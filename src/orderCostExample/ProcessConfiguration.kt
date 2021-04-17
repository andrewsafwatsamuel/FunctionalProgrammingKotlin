package orderCostExample

val invoiceConfiguration = mapOf<InvoiceChoice, (Order) -> Invoice>(
    Pair(InvoiceChoice.INV1, ::inv1),
    Pair(InvoiceChoice.INV2, ::inv2)
)
val shippingConfiguration = mapOf<ShippingChoice, (Invoice) -> Shipping>(
    Pair(ShippingChoice.SHIP1, ::ship1),
    Pair(ShippingChoice.SHIP2, ::ship2)
)

val freightCostConfiguration = mapOf<FreightChoice, (Shipping) -> FreightCost>(
    Pair(FreightChoice.FR1,::fr1),
    Pair(FreightChoice.FR2,::fr2)
)

val availabilityConfiguration = mapOf<AvailabilityChoice, (Order) -> Availability>(
    Pair(AvailabilityChoice.AV1,::av1),
    Pair(AvailabilityChoice.AV2,::av2)
)

val shippingDateConfiguration = mapOf<ShippingDateChoice, (Availability) -> ShippingDate>(
    Pair(ShippingDateChoice.SHIP_DATE1,::shipDate1),
    Pair(ShippingDateChoice.SHIP_DATE2,::shipDate2)
)