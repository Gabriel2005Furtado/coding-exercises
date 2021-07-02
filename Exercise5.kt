fun main() {

    println("hey, here is one activity. is that cool? pls answer :)")
    
    readLine()!!
    
    println("nice, that is great! pls write your name here :D")
    
    val yourName = readLine()!!
    
    println("$yourName nice to meet you! ok lets begin wiith the Exercise. i will make some question and your answer me and I will in end tell you the result.. ist ok?")
    
    readLine()!! 
    
    println("nice :D!! ok, how much money are you willing to spend? !!pls answer only with numbers now!!")
    
    var myMoney1 = readLine()!!
    var myMoney2: Float = myMoney1.toFloat()
    
    
    println("..ok that is good, $yourName now pls give a value $ to the Bitcoin price (can be imaginary")
    var firstCoin = readLine()!!
    var priceBitcoin: Float = firstCoin.toFloat()
    
    println("perfect! you got it. $yourName pls to the same thing with the Ethereum :)")
    var secondCoin = readLine()!!
    var priceEthereum: Float = secondCoin.toFloat()
    
    println("very good! do the same with Litecoins :)")
    var thirdCoin= readLine()!!
    var priceLitecoins: Float = thirdCoin.toFloat()
    
    println("prossesing... pls write continue")
    readLine()!! 
    
    var whatIcoldbuyBitcoin = (myMoney2 / priceBitcoin).toInt()
    var whatIcoldbuyEthereum = (myMoney2 / priceEthereum).toInt()
    var whatIcoldbuyLitecoins = (myMoney2  / priceLitecoins).toInt()
    
       
    
    var moneyLeftifIbuyOnlyBitcoin = myMoney2 - (priceBitcoin * whatIcoldbuyBitcoin)
    var moneyLeftifIbuyOnlyEthereum = myMoney2 - (priceEthereum * whatIcoldbuyEthereum)
    var moneyLeftifIbuyOnlyLitecoins = myMoney2 - (priceLitecoins * whatIcoldbuyLitecoins)
    
    println("${yourName} if you buy Bitcoin (${priceBitcoin}$)you could buy ${whatIcoldbuyBitcoin} Bitcoins and you would have ${moneyLeftifIbuyOnlyBitcoin}$ money left")
    println("${yourName} if you buy Ethereum (${priceEthereum}$)you could buy ${whatIcoldbuyEthereum} Ethereum and you would have ${moneyLeftifIbuyOnlyEthereum}$ money left")
    println("${yourName} if you buy Litecoins (${priceLitecoins}$)you could buy ${whatIcoldbuyLitecoins} Litecoins and you would have ${moneyLeftifIbuyOnlyLitecoins}$ money left")
    
    println()
    
    println("that was the Exercise5.kt ${yourName}, thaks for testing :) have a nice day!!")
    readLine()!! 
    println("thanks, you also. good bye :)")
       
    
}
