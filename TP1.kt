/**
 * premier tp kotlin 
 */

fun main() {
    println("Hello, world!!!")
    
     // PARTIE A 
    fun start(): String = "ok"
    println(start())

    // PARTIE B 
    fun joinOptions(options: Collection<String>) = options.joinToString(separator = ", ", prefix = "[", postfix = "]")
	println(joinOptions(listOf("a", "b","c")))
}