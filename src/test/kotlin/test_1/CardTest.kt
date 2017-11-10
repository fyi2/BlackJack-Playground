package test_1

import game1.Card
import junit.framework.Assert.assertEquals
import org.junit.Test

class CardTest {

    @Test
    fun t1() {
        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)

        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)



    }
}