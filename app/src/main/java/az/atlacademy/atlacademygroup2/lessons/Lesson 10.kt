package az.atlacademy.atlacademygroup2.lessons

import kotlin.jvm.internal.Intrinsics.Kotlin

fun main() {

    var a: String? = null


    try {
        println(a!!.length)
    }catch (i: NullPointerException){
        println("NullPointerException")
    }catch (s: ArrayIndexOutOfBoundsException){
        println("ex -> ${s.message}")
    }catch (e: Exception){

    }
    finally {
        println("end")
    }


}

fun check(a: Int){
    if (a > 0){
        println(a)
    }else{
        throw Exception("a < 0....")
    }
}


interface Import<in I>{
    fun importThings(value: I)
}

interface Export<out E>{
    fun exportThings(): E
}

class Anbar(private var ref: String): Import<String>, Export<String>{

    override fun importThings(value: String) {
        ref = value
    }

    override fun exportThings(): String {
        return ref
    }

}

class StringValueContainer<T>(private var value: T) {

    fun getValue(): T{
        return value
    }
}


class IntValueContainer<T: Number>(private var value: T){

    fun getValue(): T{
        return value
    }
}


class DoubleValueContainer(private var value: Double){

    fun getValue(): Double{
        return value
    }
}



class Math(){

    companion object {
        const val PI = 3.143
    }


    fun add(){
        println(PI)
    }


    fun calculateCircleArea(r: Int): Double{
        return PI * r * r
    }

}



object Database {

}

object BMW: Auto() {
    override var name: String = "BMW"

    override fun drive() {
        println("$name driving")
    }

    override fun park() {
       println("$name parking")
    }
}


object Audi: Auto(){
    override var name: String = "Audi"

    override fun drive() {
        println("$name driving")
    }

    override fun park() {
        println("$name parking")
    }

    fun printBMW(){
        BMW.park()
    }

}

abstract class Auto(){
    abstract var name: String
    abstract fun drive()
    abstract fun park()
}


class Mercedes(): Auto(){
    override var name: String = "Mercedes"

    override fun drive() {
        println("$name driving")
    }

    override fun park() {
        println("$name parking")
    }


}

class Toyota: Auto(){
    override var name: String = "Toyota"

    override fun drive() {
        println("$name driving")
    }

    override fun park() {
        println("$name parking")
    }

    fun printMercedes(mercedes: Mercedes){
        mercedes.drive()
    }

}
