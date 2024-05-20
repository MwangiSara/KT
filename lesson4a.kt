fun main() {
    val tai= arrayOf("Paul", "Silvester", "Levy", "Nelson", "Natalie")
    //Arrays are used to store multiple values in a single variable. we use arrayOf() to declare an array


    //specifying a datatype in an array
    val cars= arrayOf<String>("Volvo","BMW","Benz","toyota")
    val age= intArrayOf(50,44,79,10,33)

    //printing the values using index, we count array from index 0
    println(age[2])
    println(tai[4])
    println(cars[0])
    println()

    //updating the items using []
    tai[4]="Alphonce"
    println(tai[4])
    //update BMW to subaru and age 33 to 53
    cars[1]="subaru"
    println(cars[1])

    age[4]=53
    println(age[4])
    println()

    //updating using set()
    tai.set(0,"Simon") //updating index 0 to Simon
    println(tai[0])
    //using set update toyota to be jaguar and age 50 to be 100
    cars.set(3,"jaguar")
    println(cars[3])

    age.set(0,100)
    println(age[0])

    //geting the total number of items in an array using size function
    println(tai.size)
    println(cars.size)
    println(age.size)
}//end main