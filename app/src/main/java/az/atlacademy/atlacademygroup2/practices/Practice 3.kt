package az.atlacademy.atlacademygroup2.practices

fun main() {
    val text =
        "Implement a higher-order function 1filterStrings that takes an array of strings and a predicate function that operates on a string. The function should return an array of strings that match the predicate."
//    val result = filterStrings(text, 'o')
//    println(result)


    val p1: (Char) -> Boolean =  { it.isDigit() }
    val p2: (Char) -> Boolean =  { it.isUpperCase() }
    val p3: (Char) -> Boolean =  { it == 'r' }

    val result2 = filterStrings2(text = text, predicate = p3)

//    println(result2)

    val netice = operation(1, 2, dustur = {a ->
        a
    })

    println(netice)

}


fun operation(a: Int, b: Int, dustur: (Int) -> Int): Int {
    return dustur(a) * b
}



fun filterStrings2(text: String, predicate: (Char) -> Boolean): String {
    var newText = ""
    var word = ""

    for (i in text) {
        if (i == ' ') {
            if (predicate.invoke(word.first())) {
                newText += word + i
            }
            word = ""
        } else {
            word += i
        }
    }

    return newText
}





fun filterStrings(text: String, letter: Char): String {
    var newText = ""
    var word = ""

    for (i in text) {
        if (i == ' ') {
            val letterResult = isStartWith(letter, word.first())
            if (word[0] == letter) {
                newText += word + i
            }
            word = ""
        } else {
            word += i
        }
    }

    return newText
}


fun filterStringsIsDigit(text: String): String {
    var newText = ""
    var word = ""

    for (i in text) {
        if (i == ' ') {
            val letterResult = isDigit(word.first())
            if (letterResult) {
                newText += word + i
            }
            word = ""
        } else {
            word += i
        }
    }

    return newText
}


fun filterStringsIsUppercase(text: String): String {
    var newText = ""
    var word = ""

    for (i in text) {
        if (i == ' ') {
            val letterResult = isUpperCase(word.first())
            if (letterResult) {
                newText += word + i
            }
            word = ""
        } else {
            word += i
        }
    }

    return newText
}

fun isStartWith(c: Char, firstChar: Char): Boolean {
    return firstChar == c
}

fun isDigit(firstChar: Char): Boolean {
    return firstChar.isDigit()
}

fun isUpperCase(firstChar: Char): Boolean {
    return firstChar.isUpperCase()
}


