package test_1

import game1.Game
import org.junit.Test
import kotlin.test.assertEquals

class GameTest {
    @Test
    fun t1(){
        val g = Game(shuffle = false)
        assertEquals(48, g.deck.size)
        assertEquals(g.ph.size, 2)
        assertEquals(g.ph.points, 14)
        assertEquals(g.dh.size, 2)
        assertEquals(g.dh.points, 6)
        g.hit()
        assertEquals(47, g.deck.size)
        assertEquals(g.ph.size, 3)
        assertEquals(g.ph.points, 19)
        assertEquals(g.dh.size, 2)
        assertEquals(g.dh.points, 6)
        g.hit()
        assertEquals(46, g.deck.size)
        assertEquals(g.ph.size, 4)
        assertEquals(g.ph.points, 15)
        assertEquals(g.dh.size, 2)
        assertEquals(g.dh.points, 6)
        g.stay()
        assertEquals(44, g.deck.size)
        assertEquals(g.ph.size, 4)
        assertEquals(g.ph.points, 15)
        assertEquals(g.dh.size, 4)
        assertEquals(g.dh.points, 21)
    }
}

