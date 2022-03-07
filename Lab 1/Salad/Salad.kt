package Salad

import Vegetables.*

class Salad(vegetables: Iterable<Vegetable>) {
    private val ingredients = vegetables.toList()
    val calories get() = ingredients.sumOf { ingredient -> ingredient.calories }
}