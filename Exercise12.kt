​
fun main() {
    
    
    val memeCost: Float = 0.05F
    val wikiCost: Float = 0.50F
    
    val minInMeme: Float = 700F
    val minInWiki: Float = 9F
    
    val timecostMeme: Float = memeCost * minInMeme
    val timecostWiki: Float = wikiCost * minInWiki
            
    val memeMB: Float = 1000 - timecostMeme
    val wikiMB: Float =  1000 - timecostWiki
    val mb: Float = 1000 - memeMB - wikiMB
​
    if (timecostMeme > timecostWiki) {
        println("WOAH MEME")
    }
    println("balbalbal")
}
​
