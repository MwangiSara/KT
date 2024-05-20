fun main() {
    //arithmetic operations
    val num1=44
    val num2:Double=55.99
    val num3=num1+num2
    println("the sum is:"+num3) // concatenating usin plus(+)
    println("the solution is: $num3") //concatenating using $
    println("$num1 + $num2 ="+num3)

    //MULTIPLICATION 
    val num7=66
    val num8=55
    val num9=108
    val num10=num7*num8*num9
    println("the product is: $num10")
    // modulus
    val mol=8856%12
    println("the modulus is :"+mol)

    //division
    val divi:Double=55561.92/50.77
    println(divi)

    val n=55561.92
    val n2=50.77
    val ans=n/n2
    println("the other division give us:"+ans)
    // 55561.92/50.77

    //Calculating the BMI(weight/height^2)
    val weight=90.3
    val height=200.77
    val BMI=weight/(height*height)
    println("My BMI is: $BMI")
}