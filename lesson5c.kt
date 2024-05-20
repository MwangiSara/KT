fun main() {
    //parameters are variables taht are created when we create a functions, we place them inside the parenthesis of the function
    //arguments are values that are passed when we call functions with parameters
    add(num1=400, num2=600.99)
    add(756,421.9)
    add(642,964.77)
    add(512,536.88)
    println()

    check(10)

    fuctorial(1)
}//end main

//num1 and num2 are parameters in the function add()
fun add(num1:Int, num2:Double){
    //we have to state the datatype when creating parameters, we separate parameters using a comma
    val sum:Double = num1 + num2
    println("$num1 + $num2 = $sum")
}//end add

fun check(value:Int){
    if(value > 50){
        println("$value is greater than 50")
    }//end if
    else{
        println("$value is less than 50")
    }//end else
}//end check
//create a function that checks if a number is positive or negative
//Create a Function in Kotlin to Find Simple Interest Include Parameters (Principle*Time*Rate).
//Create Function to Find Area of a Circle Given PI*radius * radius(include parameters)
//find the factorial of 10 (1*2*3*4*5*6*7*8*9*10)
fun fuctorial(number:Int){
    var prod:Int= 1
    var num = number
    while(num <= 10){
        prod = prod * num
        num++
    }//end while
    println(prod)
}//end fuctorial
