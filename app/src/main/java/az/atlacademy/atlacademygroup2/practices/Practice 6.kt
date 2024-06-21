package az.atlacademy.atlacademygroup2.practices

fun main() {
    val button = Button(120, 20, "Red")
    val text = TextView("Salam", 120, 40, "White")
    text.run()
}

abstract class Component(){
    abstract val with: Int
    abstract val height: Int
    abstract val backgroundColor: String

    open fun run(){

    }
}

class Button(
    override val with: Int,
    override val height: Int,
    override val backgroundColor: String
) : Component(), Clickable, LongClickable{

    override fun onClick() {

    }

    override fun onLongClick() {

    }

    override fun run() {

    }
}

class CheckBox(
    override val with: Int,
    override val height: Int,
    override val backgroundColor: String
) : Component(), Clickable{

    override fun onClick() {

    }

}

class TextView(
    val text: String,
    override val with: Int,
    override val height: Int,
    override val backgroundColor: String
) : Component(), LongClickable{

    override fun onLongClick() {

    }

}

interface Clickable{
    fun onClick()
}

interface LongClickable{
    fun onLongClick()
}