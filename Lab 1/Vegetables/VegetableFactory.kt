package Vegetables

object VegetableFactory  {
    fun createNew(type: VegetableType): Vegetable{
        return when(type) {
            VegetableType.CELENY -> Celery()
            VegetableType.Cucumber -> Cucumber()
            VegetableType.LETTUCE -> Lettuce()
            VegetableType.ONION -> Onion()
            VegetableType.Potato -> Potato()
            VegetableType.TOMATO -> Tomato()
        }
    }
}