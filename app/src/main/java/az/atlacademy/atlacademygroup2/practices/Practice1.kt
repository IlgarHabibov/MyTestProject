package az.atlacademy.atlacademygroup2.practices

import az.atlacademy.atlacademygroup2.R


fun main() {

    val mercedes = Car("Mercedes", "Sedan", "Grey", 240)

    val ferrari = Car("Ferrari", "Sport", "White", 340, fuelType = "98")

    val audi = Car("Audi", "Sedan", "Green", 200, 60, "98")


//    println(mercedes.cost)
//    println(mercedes.costText)

    var a = 10

    mercedes.a = 20

    println(mercedes.a)

}


class Car constructor (
    val name: String,
    val type: String ,
    var color: String,
    var maxSpeed: Int,
    var fuelSize: Int = 0,
    var fuelType: String? = null,
    ) {


    var costText: String = ""

    var a: Int = 1
        set(value) {
            field = value + 10
            costText = "$value$"
        }
        get() = 100



    init {
    }

    fun startEngine(time: String): String {
        return "$name started at $time"
    }



    fun drive() {
//        println("Cost of $name is $cost")
    }

    fun park() {

    }

}


class Smartphone(val model: String) {


    fun getPhoneModel(): String {
        return model
    }

}



