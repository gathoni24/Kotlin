//Parent class
open  class Shape {
    open fun draw(){
        println("Drawing a shape")

    }
}


//Child Class
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

class Parallelogram{

    fun draw (){
        println("Drawing a parallelogram")
    }
}

fun main(){
    var s = Shape()

    var r = Rhombus()

    var p = Parallelogram()

}