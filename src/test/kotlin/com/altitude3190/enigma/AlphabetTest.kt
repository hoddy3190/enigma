package com.altitude3190.enigma

import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class AlphabetTest {

    private lateinit var alph: Alphabet

    @Before
    fun setUp() {
        alph = Alphabet("ABCD")
    }

    @Test
    fun shift() {
        assertEquals(0, alph.shift(0, 0))
        assertEquals(3, alph.shift(1, 2))
        assertEquals(0, alph.shift(2, 2))
        assertEquals(1, alph.shift(0, 5))
    }

    @Test
    fun getSize() {
        assertEquals(4, alph.getSize())
    }

    @Test
    fun getChar() {
        assertEquals('C', alph.getChar(2))
    }

    @Test
    fun getIndex() {
        assertEquals(3, alph.getIndex('D'))
    }

    @Test
    fun getIndices() {
        assertArrayEquals(arrayOf(0, 1, 2, 3), alph.getIndices().toList().toTypedArray())
    }

}