fun main() {
    val new = student()
    new. id = 1
    new. name = "shifat"
    new.age = 21
    new. ditels()

    println("------------")

    val new1 = student()
    new1. id = 2
    new1. name = "SAS"
    new1.age = 21
    new1. ditels()
}

class student(){
    var id: Int=0
    var name: String=""
    var age: Int=0

    fun ditels(){
        println("id is $id")
        println("name is $name")
        println("age is $age")
    }
}