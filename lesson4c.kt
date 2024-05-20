fun main() {
    //we can use drop() or dropLast() to remove values in an array at the beginning and end respectively
    val football_players = arrayOf("rashford","jude","nelson","Onana","Ryan","jesus")
    val drop_begin = football_players.drop(2) //dropping the first 2 values
    for(players in drop_begin){
        println(players)
    }//end for

    //drop Ryan and Jesus using dropLast()
    val drop_last=football_players.dropLast(2)//we are dropping the last two values
    for(players in drop_last){
        println(players)
    }//end for

}