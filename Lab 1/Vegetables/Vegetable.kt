package Vegetables

enum class VegetableType(var str: String) {
    CELENY("Celeny"),
    ONION("Onion"),
    LETTUCE("Lettuce"),
    Potato("Potato"),
    TOMATO("Tomato"),
    Cucumber("Cucumber");

    fun getStr_3(): String{
        return str
    }
}

abstract class Vegetable {
    abstract val calories: Long
}

abstract class Herb: Vegetable()

class Celery : Herb() {
    override val calories: Long
        get() = 14
}
class Onion : Herb() {
    override val calories: Long
        get() = 19
}
class Lettuce : Herb() {
    override val calories: Long
        get() = 16
}

abstract class Veg: Vegetable()

class Potato : Veg() {
    override val calories: Long
        get() = 82
}
class Tomato : Veg() {
    override val calories: Long
        get() = 20
}
class Cucumber : Veg() {
    override val calories: Long
        get() = 15
}