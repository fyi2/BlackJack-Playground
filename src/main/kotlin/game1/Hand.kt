package game1

class Hand(val name: String) {

    private val _cards = mutableListOf<Card>()
    private var _ace = false

    val cards: List<Card> get() = _cards

    fun add(card: Card) {
        _cards.add(card)
    }

    val size get() = _cards.size

    val points: Int
        get() {
            var t = 0
            _ace = false
            _cards.forEach({
                if (it.points == 11){
                    _ace = true
                }
                t += it.points
                if((t>21)&&(_ace)){
                    t -=10
                }
            })
            return t
        }
}