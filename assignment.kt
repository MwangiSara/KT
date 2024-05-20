fun main() {
    //using when expression, check wich age generation a person is
    //5-20 Gen z
    //21-39 millenial
    //40- 55 gen x
    //56-70 baby boomer

    val age:Short=55
    when(age){
        in 5..20 -> println("age $age is genz")
        in 21..39 -> println("age $age is millenial")
        in 40..55 -> println("age $age is gen X")
        in 56..70 -> println("age $age is baby boomer")
        else -> println("$age is an invalid age")
    }//end when
}//end main