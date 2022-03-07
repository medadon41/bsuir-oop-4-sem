import Salad.SaladCooker
import Vegetables.VegetableType

fun main() {
    val salad = SaladCooker.create(mapOf(
        VegetableType.TOMATO to 7,
        VegetableType.Cucumber to 7,
        VegetableType.ONION to 3
    ))
    println("Your salad is ready! It will cost you ${salad.calories} ccal")
}