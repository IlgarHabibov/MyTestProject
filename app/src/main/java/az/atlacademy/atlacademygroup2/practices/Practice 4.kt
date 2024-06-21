package az.atlacademy.atlacademygroup2.practices

fun main() {
    val person = PersonNew(name = "Ali", age = 22)
    val book = Book("Sefiller", "Viktor Huqo", 50)
    println(person.getStatus())
    println(person.read(book))

}

// 1. Create a class Employee with properties name and salary.
// Derive classes Manager and RegularEmployee from Employee.
// Managers have an additional property bonus that affects their total salary.


open class Employee(
    private var name: String,
    private var salary: Double
) {
    open fun getSalary(): Double {
        return salary
    }
}

class Manager(
    private var name: String,
    private var salary: Double,
    private var bonus: Double
) : Employee(name, salary) {

    override fun getSalary(): Double {
        return salary + bonus
    }

}

class RegularEmployee(
    name: String,
    salary: Double,
) : Employee(name, salary)


// 2. Create an abstract class Device with properties name and powerOn.
// Implement classes Laptop and TV that extend Device and provide concrete
// implementations for turnOn().


abstract class Device(private var name: String, private var powerOn: Boolean) {
    abstract fun turnOn()
}

class Laptop(var name: String, var powerOn: Boolean) : Device(name, powerOn) {

    override fun turnOn() {
        powerOn = true
        println("$name powerOn $powerOn")
    }
}

class TV(var name: String, var powerOn: Boolean) : Device(name, powerOn) {

    override fun turnOn() {
        powerOn = true
        println("$name powerOn $powerOn")
    }
}

//Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
// Implement classes Circle and Rectangle that extend Shape and provide concrete implementations
// for the abstract methods. Implement a class Triangle that extends Shape and overrides
// the calculateArea() and calculatePerimeter() methods to handle triangle-specific calculations.

abstract class Shape() {
    abstract fun calculateArea()
    abstract fun calculatePerimeter(): Double
}


class Circle(private var radius: Double) : Shape() {

    override fun calculateArea() {
        println(Math.PI * radius * radius)
    }

    override fun calculatePerimeter(): Double {
        return Math.PI * radius * 2
    }

}

class Triangle(
    private var a: Double,
    private var b: Double,
    private var c: Double,
    private var h: Double
) : Shape() {

    override fun calculateArea() {
        println(a * h / 2)
    }

    override fun calculatePerimeter(): Double {
        return a + b + c
    }

}


// 5 Create a class Person with private properties name and age,
// and public methods to get and set these properties.

class Person(
    private var name: String,
    private var age: Int
){

    fun getName() = name
    fun getAge() = age
}

// 6 . Create an interface Vehicle with methods startEngine() and stopEngine().
// Implement it in classes Car and Motorcycle.

interface Vehicle{
    fun startEngine()
    fun stopEngine()
}

class Car2: Vehicle {
    override fun startEngine() {
        println("Card engine started")
    }

    override fun stopEngine() {
        println("Card engine stoped")
    }
}

class Motorcycle: Vehicle{
    override fun startEngine() {
        println("Motorcycle engine started")
    }

    override fun stopEngine() {
        println("Motorcycle engine stoped")
    }

}

// 9 Create a class Calculator with private methods for basic operations (add, subtract)
// and a public method calculate that uses these private methods.

class PersonNew(
    private var name: String,
    private var age: Int
){
    fun getStatus(): String{
        return when(age){
            in 0..3 -> "$name korpedir"
            in 4..5 -> "$name bagcaya gedir"
            in 6..10 -> "$name ibtidai sinife oxuyur"
            in 11..17 -> "$name orta mektebde oxuyur"
            in 18..22 -> "$name universitetde oxuyur"
            in 23..50 -> "$name isleyir"
            else -> "$name teqauddedir"
        }
    }



    fun read(book: Book): String{
        return if (book.pageCount > 100){
            "$name ${book.name} kitabini oxudu. ${book.authorName} muellifini beyenmedi"
        }else{
            "$name ${book.name} kitabini oxudu. ${book.authorName} muellifini beyendi"
        }
    }
}

class Book(var name: String, var authorName: String, var pageCount: Int)

