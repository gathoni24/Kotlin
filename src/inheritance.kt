//Parentclass/Superclass/Baseclass
class Animal {
    var age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Childclass/Subclass/Derivedclass
class duck{
    var color = "white"
    fun sound(){
        println("Duck is quacking")
    }
}

class  fish{
    var hasScales = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }

}

fun main(){
    var a = Animal()

    var d = duck()

    var nileperch=fish()
}

fun main(){

}
