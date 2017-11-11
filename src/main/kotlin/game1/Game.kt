package game1


class Game(shuffle: Boolean) {

    val deck = Deck(shuffle)
    val ph = Hand("Player")
    val dh = Hand("Dealer")

    init {
        ph.add(deck.take())
        dh.add(deck.take())
        ph.add(deck.take())
        dh.add(deck.take())
    }

    fun hit() {
        if(ph.points < 21) {
            ph.add(deck.take())
        } else {
            println("BUSTED")
        }
    }

    fun stay() {
        while(dh.points < 17) dh.add(deck.take())
    }
}