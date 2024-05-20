fun main() {
    //variable in kotlin, variable store data/values
    //when creating a variable we use keyword val or var
    val tai=44
    println(tai)
    //kotlin has 9 datatypes: int, short, long, char, boolean,float,string,byte, double
    val age:Int=220000000 // int datatype has a maximum limit of 2.2b and has no decimals
    println(age)// println()automatically prints a new line
    val salary:Short=20000 //short datatype has a maximum limit of 35000 and has no decimals
    println(salary)
    val meters:Long=6000000000 //long datatype has a minimum limit of 2b and has no decimals
    println(meters)
    val letters:Char='s' //char datatype is for single characters only and we use single quotes
    println(letters)
    val name:String="Sarah" //string datatype is for more than one character, inclusive of special characters like $,% etc. we use double quotes.
    println(name)
    val height:Double=130.7 //double datattype has a decimal  and has no limit. we dont use float most of the time in kotlin.
    println(height)
    val bool:Boolean=true //its either true or false, we use small letters unlike in  python
    println(bool)
    // getting datatype
    val word="6000"
    println(word::class.java.typeName)
}