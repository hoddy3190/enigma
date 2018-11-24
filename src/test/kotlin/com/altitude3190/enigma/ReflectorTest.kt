package com.altitude3190.enigma

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