package states

import Task

interface TaskState {

    fun assign(task: Task)
    fun complete(task: Task)
    fun submit(task: Task)
    fun review(task: Task)
    fun uncomplete(task: Task)

}