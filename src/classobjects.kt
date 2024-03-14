class Person{
    //Attributes/Properties

    var name = "John"
    var age = 67
    var gender = "Male"

    //methods/functions
    fun walk(){
        println("Person is walking")
    }
}

fun main(){
    var accountant = Person()
    accountant.walk()

    println(accountant.gender)
}