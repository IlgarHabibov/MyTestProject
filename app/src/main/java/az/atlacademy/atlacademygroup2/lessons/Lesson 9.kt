package az.atlacademy.atlacademygroup2.lessons

fun main() {

//    checkResult(Result.Error("problem"))
//    checkResult(Result.Success("Ilgar", 34))

    val test: Season = Winter()
    checkSeason(test)
}


fun checkResult(result: Result){
    when(result){
        is Result.Error -> println("Error message=${result.errorMessage}")
        is Result.Success -> println("Success, name=${result.name} age=${result.age}")
    }
}


fun checkSeason(season: Season){
    when(season){
        is Autumn -> {
            println("Autumn")
        }
        is Spring -> {
            println("Spring")
        }
        is Summer -> {
            println("Summer")
        }
        is Winter -> {
            println("Winter")
        }
    }
}

sealed class Result(){
    class Success(var name: String, var age: Int): Result()
    class Error(var errorMessage: String): Result()

}

sealed class Seasons(){
    class Winter(): Seasons()
    class Spring(): Seasons()
    class Summer(): Seasons()
    class Autumn(): Seasons()
}


open class Season()
class Winter(): Season()
class Spring(): Season()
class Summer(): Season()
class Autumn(): Season()
