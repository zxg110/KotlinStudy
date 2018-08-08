data class Person(var name:String) {
    var no:String=""
        get() = field.toUpperCase()

}

fun main(args: Array<String>) {
    var p1:Person = Person("zhang")
    println("name:"+p1.toString())
}