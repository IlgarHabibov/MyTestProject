package az.atlacademy.atlacademygroup2.practices

fun main() {

    val currency = Currency.MANAT
    val currency2 = Currency.DOLLAR
    val currency3 = Currency.EURO
    println("100${currency.symbol}")
    println("100${currency2.symbol}")
    println("100${currency3.symbol}")

}

fun checkSeason(season: Season){
    println(season.isCold())

}

fun handleResponse(response: Response){
    when(response){
        is Response.Failure -> println("Failure")
        is Response.Success -> println("Success")
    }
}

// 6. Create a sealed class Response with subclasses Success and Failure. Use a when expression to handle each subclass.

sealed class Response(){
    class Success: Response()
    class Failure: Response()
}

// 7. Create a sealed class Shape with subclasses Circle and Rectangle. Add properties and methods relevant to each shape.

sealed class Shape2{
    abstract fun area(): Double

    class Circle(val radius: Int): Shape2(){
        override fun area(): Double{
            return Math.PI * radius * radius
        }
    }

    class Rectangle(val height: Int, val with: Int): Shape2(){
        override fun area(): Double{
            return (height * with).toDouble()
        }
    }
}
// 8. Implement a sealed class Message with subclasses TextMessage and ImageMessage, each with a method send().

sealed class Message{
    abstract fun send()
    class TextMessage: Message() {
        override fun send() {
            println("send TextMessage")
        }
    }

    class ImageMessage: Message() {
        override fun send() {
            println("send ImageMessage")
        }
    }
}

// 9. Create a sealed class ScreenState with subclasses Loading, Success, and Error, and use it to manage UI state in a function.
// 10. Define a sealed class Operation with subclasses Addition and Subtraction that take two integers as parameters.
// 11. Define an enum class Color with properties rgb and description.

enum class Color(var rgb: Int){
    WHITE(0xFFFFFF),
    BLACK(0x000000),
    RED(0xFF0000);

    fun getHexCode(): String{
        return String.format("#%06X", (0xFFFFFF and rgb))
    }
}

sealed class ColorNew(){
    class White(var rgb: String, var desc: String): ColorNew()
    class Black(var rgb: String, var desc: String): ColorNew()
    class Red(var rgb: String, var desc: String): ColorNew()
}
//12. Implement an enum class Season with a method isCold() that returns true for winter and false for other seasons.

enum class Season(var cold: Boolean){
    WINTER(true),
    SPRING(false),
    SUMMER(false),
    AUTUMN(false);

    fun isCold() = cold
}
//13. Create an enum class Signal with constants RED, YELLOW, GREEN. Use it in a when expression.
//14. Implement an enum class Currency with properties symbol and code.

enum class Currency(var symbol: Char, var code: String){
    MANAT('₼', "AZN"),
    DOLLAR('$', "USD"),
    EURO('€', "EUR")
}
//15. Create a class Computer with a nested class Processor that prints a message.
//16. Define a class House with a nested class Room that has a property size and a method to print it.
//17. Create a class CoordinateSystem with a nested class Point that holds data (e.g., x and y coordinates) and a method to print the data.
//18. Define a class Garden with an inner class Flower that has a property color and a method to print it.
//19. Implement a class Company with a method and an inner class Department that calls this method.
//20. Define a class Shop with an inner class Product that has methods to calculate the discount and final price.

