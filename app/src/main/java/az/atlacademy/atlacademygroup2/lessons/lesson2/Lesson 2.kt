package az.atlacademy.atlacademygroup2.lessons.lesson2

fun main() {
    // Task 1


    val name = "Ilgar"
//    name.getMyNewText(0)

    var num1: Int = 5
    var num2: Int = 10
    println(num1 + num2)

    var a: Double = 10.0
    var b: Double = 20.0
    println(a * b)

//    val number = 1234446456
//
//    if (number == 0)
//        println(" Ne Cut Ne Tek")
//    else if ((number % 2) == 0)
//        println("Cut")
//    else
//        println("Tek")
//
//
//    val result = if (number == 0)
//        " Ne Cut Ne Tek"
//    else if ((number % 2) == 0)
//        "Cut"
//    else
//        "Tek"
//
//    println(result)
//
//    when{
//        number == 0 -> println(" Ne Cut Ne Tek")
//        (number % 2) == 0 -> println("Cut")
//        else -> println("Tek")
//    }
//
//    val result2 = when{
//        number == 0 -> " Ne Cut Ne Tek "
//        (number % 2) == 0 -> "Cut "
//        else -> "Tek"
//    }
//
//    println(result2)]


// task 2

//    val a = 10
//    val b = 10
//    val c = 10
//
//    if (a >= b && a >= c){
//        println(a)
//    } else if (b >= a && b >= c){
//        println(b)
//    }else if (c >= a && c >= b) {
//        println(c)
//    }
//
//    when{
//        a >= b && a >= c -> println(a)
//        b >= a && b >= c -> println(b)
//        c >= a && c >= b -> println(c)
//    }


//
//    task 3
//
//    val number = 1212
//
//    if (number == 0){
//        println("Zero")
//    }else if (number > 0){
//        println("Positive")
//    }else {
//        println("Negative")
//    }
//
//
//    when{
//        number == 0 -> println("Zero")
//        number > 0 -> println("Positive")
//        else -> println("Negative")
//    }
//


    val unknown: Any = true
    println(unknown)

    val unknownInt = (unknown as? Int)
    println(unknown)

    when(unknown){
        is Int ->println("Int length = ${unknown.inv()}")
        is Long -> println("Long")
        is Float ->println("Float")
        is Double ->println("Double")
        is Boolean ->println("Boolean")
        is Char ->println("Char")
        is String ->{
            println("String length = ${unknown.length}")
        }
    }
}
