class Calculator {
    //properties
    var a:Int = 10
    var height:Int =30
    var b:Int = 40

    //behaviour
    fun trapeziumArea(){
        val trapezium_area = ((a + b)*height)/2
        println("the area of the trapezium is: $trapezium_area")
    }//end trapeziumArea
}//end Calculator

fun main() {
    var my_object = Calculator()

    //get the behaviour (area)
    my_object.trapeziumArea()
}