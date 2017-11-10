package test_1

import game1.Card
import junit.framework.Assert.assertEquals
import org.junit.Test

class CardTest {

    @Test
    fun t1() {
        val c1 = Card(1,1)
        val c2 = Card(13,4)

        assertEquals(1,c1.value)
        assertEquals(1,c1.suit)

        assertEquals(13,c2.value)
        assertEquals(4,c2.suit)
    }
}