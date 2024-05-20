fun main() {
    //for loop iterates over a sequence(range, list, array, string), unlike while loop we know when the looping ends and we dont increment

    //looping through range
    for(num in 1..10){
        println(num)
    }//end for

    //different ways of itereting through a range
    print("printing in descending order using downTo expression")
    for(num2 in 10 downTo 1) println(num2)

    print("printing even number in 1-10 using step expression")
    for(num3 in 0..10 step 2){println(num3)}//end for

    print("printing even number in 40-80 using step expression")
    for(num4 in 40..80 step 2){println(num4)}//end for

    println("print even numbers from 40 to 80 in descending order")
    for(num5 in 80 downTo 40 step 2) println(num5)//endfor

    //iterete through an array
    val oop = arrayOf("kotlin","C++", "python","Java","Javascript","c#","Ruby")
    for(languages in oop){
        println(languages)
    }//end for

    //iterate a string
    val text="kotlin"
    for(letters in text){
        println(letters)
    }//end for

    //jump in kotlin has 3 structral expressions:
    //break terminates the nearest enclosing loop
    //continue proceeds to the next step of the nearest enclosing loop
    //return, by default returns a value or terminates a function

    for(numbers in 1..10){
        // print(numbers)//prints 1 2 3 4
        if (numbers==4){
            // print(numbers) //prints 4
            break
        }//end if
        else{
            print(numbers)
            continue
        }//end else
        print(numbers)
    }//end for
}// end main