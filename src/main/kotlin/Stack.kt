class Stack<T> {
    val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return stack.removeLastOrNull()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun toString(): String {
        return "stack = ${stack.reversed()}"
    }
}