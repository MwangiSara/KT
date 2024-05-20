fun main() {
    // a function is a block of code that is used to perform a certain task
    //SLF are built in function that one can use 

    val number: Double = 500.00
    val square_root: Double = Math.sqrt(number) //sqrt() is a built in function for finding square root
    println(square_root) //print is a built in function
    // you can create functions yourself, these functions are called user-defined functions. they are created outside the function main and called/invoked/accessed in the function main
    hello()
    name()
    age()
}//end main

fun hello(){
    println("Hello World!") //we use the keyword fun to create functions
}//end hello

fun name(){
    println("Enter your name")
    val name = readLine()!!.toString()
}//end name
//create a function that asks you to enter your age

fun age(){
    println("Enter your age")
    val age = readLine()!!.toInt()
}//end age

