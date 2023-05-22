fun music_lover(){
    val ammount = 15000
    val paymentFee: Float = if (ammount <= 1000) 0F
                    else if (ammount in 1001..10_000) 100F else (ammount * 0.05).toFloat()
    val regularCustomer = true

    val result = if (regularCustomer) (ammount - paymentFee)*0.99 else ammount - paymentFee

    println("сумма вашей покупки с учетом скидки $result")
}