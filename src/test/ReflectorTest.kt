package com.swet.enigma.test

import com.swet.enigma.Alphabet
import com.swet.enigma.Reflector
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class ReflectorTest {

    private lateinit var reflector: Reflector
    private val refcfg = mapOf(
            0 to 2,
            1 to 3
    )

    @Before
    fun setUp() {
        reflector = Reflector(3, Alphabet("ABCD"), refcfg)
    }

    @Test
    fun substitute() {
        assertEquals(1, reflector.substitute(3))
        assertEquals(3, reflector.substitute(1))
    }

}