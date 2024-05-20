fun main() {
    //when is used to evaluate multiple conditions, it works the same as if..else statement but is faster. it matches against all branches sequently untill some branch conditioon is satisfied

    //using when, lets check is a number is less/greater/equal to 100
    val a:Int = 55
    when{
        a<100 -> println("$a is less than 100")
        a>100 -> println("$a is greater than 100")
        a==100 -> println("$a is equal to 100")
        else -> println("invalid") //it will be printed if all the conditions above are not met/false
    }//end when

    //the cool thing about when expression is that we can use range.
    val marks=94
    when(marks){
        in 0..30 -> println("You have $marks - below average")
        in 31..50 -> println("you have $marks - average")
        in 51..75 -> println("you have $marks - above average")
        in 76..100 -> println("you have $marks - excellent")
        else -> println("invalid marks")
    }//end when
}//end main