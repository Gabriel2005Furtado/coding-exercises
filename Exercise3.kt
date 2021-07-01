fun main() {
​
    val bitcoin19Mai2016: Float = 1110.55F
    val bitcoin12April2021: Float = 53193.12F
    var diferenzFrom2016to2021: Int = (bitcoin12April2021 / bitcoin19Mai2016 *100).toInt()
    val bitcoinProfit: Float = bitcoin12April2021 - bitcoin19Mai2016
    
    println("In 19.Mai.2016 I bought Bitcoin for ${bitcoin19Mai2016}$")
    println("5 years (12.april.2021) later I sold my Bitcoin for ${bitcoin12April2021}$ ")
    println("I have a ${bitcoinProfit}$ profit.. that is insane, that is + ${diferenzFrom2016to2021}%")
           
}
