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

    // A. classes de donnees
    class Person(var name: String, var age: Int)
    var Personne = Person("Ines",28)
 	
    // on affiche le resultat
    println(Personne.name)
    println(Personne.age)
}