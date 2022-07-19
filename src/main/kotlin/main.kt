fun main() {
    val amount = 1_000
    val percentageCommission = 0.75
    val minimumCommission = 350

    /**
     * расчет суммы комиссии
     */
    var amountCommission: Int = (amount * percentageCommission / 100).toInt()

    /**
     * Проверка суммы комиссии на минимальный порог
     */
    if (amountCommission < minimumCommission) {
        amountCommission = minimumCommission
    }

    println("amount commission: $amountCommission")
}

