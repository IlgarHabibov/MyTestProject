package az.atlacademy.atlacademygroup2.practices

fun main() {
    println(divide(1, 0))
    try {
        validateName("")
    }catch (e: IllegalArgumentException){
        println(e.message)
    }
}

//1. Implement a singleton object Database with a method connect() that prints a connection message.
object Database{
    var count = 0
    fun connect(){
        count ++
        println("Connected")
    }

    fun printCount(){
        println("count=$count")
    }
}
//2. Create a singleton object Settings that has a property theme and a method applyTheme() that prints the current theme.
object Settings{
    var theme = ""
    fun applyTheme(){
        println(theme)
    }
}

//3. Define a singleton object UserSession with properties userId and token, and a method printSessionInfo() to display these properties.
//4. Define a singleton object SystemDefaults with default values for language and region, and methods to get and set these values.
object SystemDefaults{
    private var language = ""
    private var region = ""

    fun getLanguage() = language

    fun getRegion() = region

    fun setLanguage(language: String){
        this.language = language
    }

    fun setRegion(region: String){
        this.region = region
    }

}
//5. Create a singleton object AppConfig with properties appName and version, and a method printConfig().
//6. Implement a class SecureToken with a companion object that generates tokens and has a private constructor.
class SecureToken(){

    var name = ""

    companion object{
        fun generateToken(): String{
            return "asdadasdasd"
        }
    }

    fun changeName(name: String){
        this.name = name
    }

}
//7. Define a class Config with a companion object containing properties url and port.

//8. Define a generic interface Repository<T> with methods add(item: T) and remove(item: T).

interface Repository<T>{
    var myItem: T?

    fun add(item: T){
        myItem = item
    }
    fun remove(item: T){
        myItem = null
    }
}

class MyRepo<E>(override var myItem: E?) : Repository<E>{
    override fun add(item: E) {

    }
    override fun remove(item: E) {

    }

}

//9. Create a covariant generic class Producer<out T> with a method produce(): T.

abstract class Producer<out T>{
     abstract fun produce(): T
}

class MyProducer: Producer<String>(){
    override fun produce(): String {
        return ""
    }

}


//10. Define a contravariant generic class Consumer<in T> with a method consume(item: T).

//11. Write a function divide(a: Int, b: Int): Int that handles division by zero using try-catch.
fun divide(a: Int, b: Int): Int{
    return try {
        a / b
    }catch (exception: Exception){
        println("Test oldu")
        0
    }catch (nullPointer: NullPointerException){
        10
    }catch (nullPointer: RuntimeException){
        10
    }
}
//12. Implement a function that handles different types of exceptions (e.g., NumberFormatException, NullPointerException) with multiple catch blocks.
//13. Write a function validateName(name: String) that throws an IllegalArgumentException if the name is empty.
fun validateName(name: String){
    if (name.isEmpty()){
        throw IllegalArgumentException()
    }
}

//14. Define a function readFile that throws an exception, and another function processFile that calls readFile and handles the exception.
//15. Create a class Util with a generic method printItem(item: T) that prints the item.

fun <T> print(item: T){
    println(item)
}
