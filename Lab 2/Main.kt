import states.*
import Task

fun main(args: Array<String>) {
    var task = Task(AssignedTaskState(), "Danila", 41)

    task.submit()
    task.review()
    task.uncomplete()
    task.submit()
    task.review()
    task.complete()
    task.complete()
}