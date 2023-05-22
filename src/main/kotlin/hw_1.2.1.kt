fun money_transfers(){
    val paymentFee = 0.75 //процент коммисии
    val minAmmount = 35
    val ammount = 1000    //желаемая сумма перевода

    val resultPaymentFee = if (ammount >= minAmmount) ammount * paymentFee else 0

    println("Комиссия за перевод составит $resultPaymentFee")
}