package test_1

import game1.Card
import junit.framework.Assert.assertEquals
import org.junit.Test
import kotlin.test.fail

class CardTest {

    @Test
    fun t1() {
        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("Ace", c1.valueName)
        assertEquals("Ace of Spades", c1.name)
        assertEquals(1, c1.points)


        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)
        assertEquals("King", c2.valueName)
        assertEquals("King of Diamonds", c2.name)
        assertEquals(10, c2.points)

        try {
            val c3 = Card(value = 1, suit = 5)
            fail("Should Never get here")
        } catch (e: IllegalArgumentException) {
        }

        try {
            val c4 = Card(value = 14, suit = 1)
            fail("Should Never get here")
        } catch (e: IllegalArgumentException) {
        }

    }
}