package Salad

import Vegetables.Vegetable
import Vegetables.VegetableFactory
import Vegetables.VegetableType

object SaladCooker {
    fun create(ingredientsOrder: Map<VegetableType, Long>): Salad {
        val ingredients = ArrayList<Vegetable>()
        for(entry in ingredientsOrder.entries) {
            for(i in 1..entry.value) {
                ingredients.add(
                    VegetableFactory.createNew(entry.key)
                )
            }
        }
        return Salad(ingredients)
    }
}