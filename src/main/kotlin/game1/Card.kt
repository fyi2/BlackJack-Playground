package game1

class Card(var value: Int, var suit: Int) {

    val suitName: String
        get() {
            when (suit) {
                1 -> return "Spades"
                2 -> return "Hearts"
                3 -> return "Clubs"
                4 -> return "Diamonds"
                else -> return throw IllegalStateException()
            }
        }
    val valueName: String
        get() = when (value) {
            1 -> "Ace"
            in 2..10 -> value.toString()
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> "Joker"
        }
    val name:String get() = "$valueName of $suitName"

    val points:Int get() = when(value){
        in 1..9-> value
        in 10..13 -> 10
        else -> 0
    }
}