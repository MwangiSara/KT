open class Fish{ //we have to set the class fish open so that other classes can inherit from it
    //properties
    val name:String = "Nimo"

    //behaviour
    fun swim(){
        println("swoosh! swoosh!")
    }//end swim
}//end fish

class Whale : Fish() { //class whale ha inherited from class fish
    //property 
    var size:Int = 1000

    //behaviour
    fun eat(){
        println("munch! munch!")
    }//end eat

}//end whale

fun main() {
    //inheritance allows a class to inherit/acquire the proprties and behaviours of another class. eg. class Dog can inherit the property name from the class Person

    //create the object from the class whale
    val blue_whale = Whale()

    //get the properties and behaviours
    println("the name of the whale is: " +blue_whale.name)
    println("the size of the whale is: " +blue_whale.size)
    //print the behaviours of whale
    blue_whale.swim()
    blue_whale.eat()
}