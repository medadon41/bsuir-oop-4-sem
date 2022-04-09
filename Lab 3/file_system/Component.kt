package file_system

interface Component {
    var name : String
    fun add(component: Component)
    fun remove(component: Component)
    fun print()
}