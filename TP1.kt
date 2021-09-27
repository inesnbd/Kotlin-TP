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

    // B. Fonctions et classes 

    data class Customer(val name: String, val city: City, val
		orders: List<Order>) {
 			override fun toString() = "$name from ${city.name}"
		}
    
  	data class Shop(val name: String, val customers: List<Customer>)
	

    data class Order(val products: List<Product>, val isDelivered: Boolean)

    data class Product(val name: String, val price: Double) {
 
        override fun toString() = "'$name' for $price"

    }

    data class City(val name: String) {
 
        override fun toString() = name

    }
    // definis les villes existantes
     var ville: Collection<City> = listOf(City("Lyon"),City("Paris"))
     println(ville)
     
     // retourner la liste des villes des clients
    fun Shop.getCitiesCustomersAreFrom(): Collection<City>{
      return customers.map{ it.city }
         
    }
             
   // retourner la liste des clients d'une ville donnee
   fun Shop.getCustomersFrom(city : City): Collection<Customer> {
     return customers.filter { it.city.name == city.name}
    
   }
}