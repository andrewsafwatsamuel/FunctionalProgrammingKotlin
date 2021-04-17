package orderCostExample

fun invoicePath(
    config: ProcessConfiguration,
    invoiceMap: InvoiceConfig = invoiceConfiguration,
    shippingMap: ShippingConfig = shippingConfiguration,
    freightMap: FreightConfig = freightCostConfiguration
) = invoiceMap[config.invoiceChoice]!!
    .compose(shippingMap[config.shippingChoice]!!)
    .compose(freightMap[config.freightChoice]!!)

fun availabilityPath(
    config: ProcessConfiguration,
    availabilityMap: AvailabilityConfig = availabilityConfiguration,
    shippingDateMap: ShippingDateConfig = shippingDateConfiguration
) = availabilityMap[config.availabilityChoice]!!
    .compose(shippingDateMap[config.shippingDateChoice]!!)

fun <T1, T2, T3> ((T1) -> T2).compose(func: (T2) -> T3): (T1) -> T3 = { func(this(it)) }