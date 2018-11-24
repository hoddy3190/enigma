package com.swet.enigma.test

import com.swet.enigma.Alphabet
import com.swet.enigma.Component
import com.swet.enigma.Plugboard
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PlugboardTest {

    private val pbcfg = mapOf(
            1 to 2,
            2 to 1,
            0 to 3,
            3 to 0
    )
    private val alph = Alphabet("ABCD")
    private lateinit var plugboard: Plugboard

    @Before
    fun setUp() {
        plugboard = Plugboard(pbcfg)
    }

    @Test
    fun substitute() {
        // no next
        Assert.assertEquals(0, plugboard.substitute(0))

        // next
        val componentMock = Component()
        plugboard.next = componentMock
        Assert.assertEquals(1, plugboard.substitute(1))
    }

}