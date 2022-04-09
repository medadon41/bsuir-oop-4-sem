import file_system.*

fun main(args: Array<String>) {
    val newFolder = Directory("Lab3")
    val kotlinFolder = Directory("kotlin")
    val libraryFolder = Directory("file_system")
    val compFile = File("Component.kt")
    val compsFile = File("components.kt")
    val mainFile = File("Main.kt")

    libraryFolder.add(compFile)
    libraryFolder.add(compsFile)
    kotlinFolder.add(mainFile)
    kotlinFolder.add(libraryFolder)
    newFolder.add(kotlinFolder)

    newFolder.print()
    kotlinFolder.remove(mainFile)
    newFolder.print()

    //compFile.add(compsFile)
}