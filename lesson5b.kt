fun main() {
    //addition using function add()
    add()
    println(product())

    day()
}//end main

fun add(){
    val num1:Int = 5499
    val num2: Double = 400.95
    val sum:Double = num1 + num2
    println("$num1 + $num2 = $sum")
}//end add


fun product():Int{ //when using return statement you need to specify the function datatype
    val multiplication = 541 * 187
    return multiplication
}//end product
//create a function that loops a string(monday)

fun day(){
    val string:String = "monday"
    for(letters in string){
        println(letters)
    }//end for
}//end day