//a class is a real worl entity eg. car, table, person etc. we create clases outside the main function and we use the keyword class. the class name should always be capitalized
class Person{
    //properties/attributes
    var name:String = "James Bond"
    var age:Int = 54
    var height:Double = 200.77

    //behaviours/functions/methods
    fun sing(){
        println("Do Re Mi Fa So La")
    }//end sing
    fun eat(){
        println("Munch! Munch!")
    }//end eat
}//end person

fun main() {
    //oop(object oriented programming) is a programming model that organises software designs around classes(data) and objects, rather than functions and logic

    //classes contains attributes/properties(name, age, height) and behaviours/functions/methods (walk, swim, bark, dance, sing, run)

    //we create objects using class. we store the object inside a variable
    var my_object = Person()

    //lets get our behaviours and attributes using the object my_object
    my_object.sing() //we are getting behavior sing
    my_object.eat()

    println("the name of person is:" +my_object.name)//getting property name
    println("the person's age is:" +my_object.age)
    println("the height of the person is :" +my_object.height)

    //classes are used to define the attributes an behaviours of objects, while an object is used to represent a specific entity
}