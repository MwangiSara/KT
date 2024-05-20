class Dog(var name:String, var breed:String){
    //inside the parentesis is where we create the properties as constructors

    //behaviors
    fun bark(){
        println("Woof! Woof!")
    }//end bark
}//end dog

fun main() {
    //create objects
    val dog1= Dog("Bosco","German Shepherd")
    //get its property and behaviour
    println("My dog is called ${dog1.name}. it is a ${dog1.breed} breed")
    dog1.bark()
    //creating different objects
    val dog2 = Dog("Tippy","T9")
    val dog3 = Dog("spikey", "Husky")
    val dog4 = Dog("Dotie","chihuahua")
}