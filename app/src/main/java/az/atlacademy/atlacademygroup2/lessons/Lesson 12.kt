package az.atlacademy.atlacademygroup2.lessons

fun main() {
   val list = listOf(10, -12, 22, 22, 35, 45, -21, 333, 1, 2, 1, 1, 1, 1, 1)
   val list2 = listOf("10", "12aasas", "asdasdas", "asa")
//    println(list.sortedDescending())

    val newList =  list2.sortedByDescending {
        it.length
    }

    val map = mapOf("a" to "a", "b" to "b")
    val  newMap = map.takeIf {
        it.containsKey("c")
    }
    println(newMap)

}

data class Staff(val name: String, val surname: String, val age: Int)
data class StaffNew(val name: String, val surname: String)




    data class Person(val name: String, val age: Int, val city: String)
    data class Product(val name: String, val price: Double, val category: String)
    data class Student(val name: String, val grade: Int)
    data class Book(val title: String, val author: String, val pages: Int)
    data class Employee(val name: String, val salary: Double, val department: String)
