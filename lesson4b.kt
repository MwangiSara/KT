fun main() {
    //looping through an array
    val marks = intArrayOf(54,77,43,68,99,10)
    var sum =0
    //using for loop, loop through the variable marks
    for(numbers in marks){
        println(numbers)
    }//end for

    //adding integer values inside an array
    for(numbers in marks){
        sum=sum+numbers 
        println("sum is $sum")
    }//end for
    println("the total sum is: $sum")

    val num= arrayOf(60,77,90,67,41,11)
    //calcutale the product of the values in the array num
    var product=1
    for(number in num){
        product=product*number
        println(product)
    }//end for
    println("total $product")

}