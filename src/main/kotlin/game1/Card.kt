package game1

class Card(var value:Int, var suit:Int) {

    val suitName:String get(){
        when(suit){
            1-> return "Spades"
            2->return "Hearts"
            3->return "Clubs"
            4->return "Diamonds"
            else-> return throw IllegalStateException()
        }
    }
    val valueName:String get(){
        return "Ace"
    }
}