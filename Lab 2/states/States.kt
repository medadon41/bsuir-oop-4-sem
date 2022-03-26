package states

import Task

class AssignedTaskState : TaskState {

    override fun assign(task: Task) {
        println("Task (ID #${task.id}) is already assigned to ${task.assignee}")
    }

    override fun review(task: Task) {
        task.state = ReviewedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Reviewed.")
    }

    override fun complete(task: Task) {
        task.state = CompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Completed.")
    }

    override fun submit(task: Task) {
        task.state = SubmittedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Submitted for review.")
    }

    override fun uncomplete(task: Task) {
        task.state = UncompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Uncompleted.")
    }
}

class UncompletedTaskState : TaskState {

    override fun assign(task: Task) {
        task.state = AssignedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Assigned (to ${task.assignee}).")
    }

    override fun review(task: Task) {
        task.state = ReviewedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Reviewed.")
    }

    override fun complete(task: Task) {
        task.state = CompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Completed.")
    }

    override fun submit(task: Task) {
        task.state = SubmittedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Submitted for review.")
    }

    override fun uncomplete(task: Task) {
        println("${task.assignee} have not uncompleted this task yet")
    }
}

class SubmittedTaskState : TaskState {

    override fun assign(task: Task) {
        task.state = AssignedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Assigned (to ${task.assignee}).")
    }

    override fun review(task: Task) {
        task.state = ReviewedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Reviewed.")
    }

    override fun complete(task: Task) {
        task.state = CompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Completed.")
    }

    override fun submit(task: Task) {
        println("Task (ID #${task.id}) has already been submitted for review.")
    }

    override fun uncomplete(task: Task) {
        task.state = UncompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Uncompleted.")
    }
}

class ReviewedTaskState : TaskState {
    override fun assign(task: Task) {
        task.state = AssignedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Assigned (to ${task.assignee}).")
    }

    override fun review(task: Task) {
        println("Task (ID #${task.id}) has already been reviewed.")
    }

    override fun complete(task: Task) {
        task.state = CompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Completed.")
    }

    override fun submit(task: Task) {
        task.state = SubmittedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Submitted for review.")
    }

    override fun uncomplete(task: Task) {
        task.state = UncompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Uncompleted.")
    }
}

class CompletedTaskState : TaskState {
    override fun assign(task: Task) {
        task.state = AssignedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Assigned (to ${task.assignee}).")
    }

    override fun review(task: Task) {
        task.state = ReviewedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Reviewed.")
    }

    override fun complete(task: Task) {
        println("${task.assignee} has already completed this task (ID #${task.id})!")
    }

    override fun submit(task: Task) {
        task.state = SubmittedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Submitted for review.")
    }

    override fun uncomplete(task: Task) {
        task.state = UncompletedTaskState()
        println("Task's (ID #${task.id}) status has been changed for: Uncompleted.")
    }
}