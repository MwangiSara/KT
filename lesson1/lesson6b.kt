class Square{
    //properties
    var width:Int = 300
    var height:Int = 300

    //behaviours
    fun stretch(){
        println("this square can stretch")
    }//end stretch
    fun area(){
        val its_area = width * height
        println("the square has an area of:" +its_area)
    }//end area
    fun perimeter(){
        val its_perimeter= (width + height)*2
        println("the square has a perimeter of: $its_perimeter")
    }//end perimeter
}//end square

fun main() {
    //lets  create the object
    var paper = Square()

    //now lets get the properties
    println("the width is:" +paper.width)
    println("the height is:" +paper.height)

    //now lets get the behaviour
    paper.stretch()
    paper.area()
    paper.perimeter()
    
}