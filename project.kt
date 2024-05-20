fun main() {
    val pin:Int=1234

    println("Enter Paybill number")
    val pin2 = readLine()!!.toInt()
    if(pin2 != 0){
        println("enter Account Number")
        val pin3= readLine()!!.toInt()//we have to make sure that its an integer
        if(pin3 != 0){
            println("enter Amount")
            val pin4= readLine()!!.toInt()//we have to make sure that its an integer
            if(pin4 != 0){
                println("enter Pin")
                val pin5= readLine()!!.toInt()//we have to make sure that its an integer
                if(pin5 == pin){
                    println("succeffuly sent")
                }//end if
                else{
                    println("you have entered the wrong pin")
                    
                }//end else
            }//end if
        }//end if

    }
}