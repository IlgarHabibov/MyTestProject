package az.atlacademy.atlacademygroup2.lessons

fun main() {

    // {0, "Ilgar" }, {1, "Ali" },{2, "" }

    val pair = Pair<Int, String>(4, "Test")

    val map = mutableMapOf<Int?, String?>(
        0 to "Ilgar",
        null to "Ali",
        22 to null,
    )

}