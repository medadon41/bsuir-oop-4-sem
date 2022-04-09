package file_system

class Directory(_name: String) : Component {
    override var name: String = _name

    private var components : ArrayList<Component> = arrayListOf()

    override fun add(component: Component) {
        components.add(component)
        println("Successfully added ${component.name} to $name")
    }

    override fun remove(component: Component) {
        components.remove(component)
        println("Successfully removed ${component.name} from $name")
    }

    override fun print() {
        println("Directory: ${this.name}")

        if (components.isNotEmpty()) {
            println("Contains:")
            components.forEach {
                it.print()
            }
        }
    }
}

class File(_name: String) : Component {
    override var name: String = _name

    override fun add(component: Component) {
        throw NotImplementedError()
    }

    override fun remove(component: Component) {
        throw NotImplementedError()
    }

    override fun print() {
        println("File: $name")
    }
}