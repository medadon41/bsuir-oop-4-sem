import states.*

class Task(_firstState : TaskState, _assignee : String, _id : Int) {

    var state : TaskState = _firstState

    val assignee : String = _assignee

    val id : Int = _id

    fun assign() {
        state.assign(this)
    }

    fun review() {
        state.review(this)
    }

    fun complete() {
        state.complete(this)
    }

    fun submit() {
        state.submit(this)
    }

    fun uncomplete() {
        state.uncomplete(this)
    }
}