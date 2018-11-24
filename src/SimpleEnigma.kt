package com.swet.enigma

class SimpleEnigma() : Component() {

    private val refcfg = mapOf(
            0 to 2,
            1 to 3
    )

    private val rotcfg = mapOf(
            0 to 1,
            1 to 3,
            2 to 2,
            3 to 0
    )

    private val pbcfg = mapOf(
            1 to 2,
            2 to 1,
            0 to 0,
            3 to 3
    )

    fun keystroke(ch: Char): Char {
        val index = this.alph.getIndex(ch)
        return alph.getChar(next!!.substitute(index))
    }

    init {
        alph = Alphabet("ABCD")

        val reflector: Component = Reflector(3, alph, refcfg)

        val cp3: Component = Rotor(2, 2, alph, rotcfg)
        cp3.next = reflector

        val cp2: Component = Rotor(1, 1, alph, rotcfg)
        cp2.next = cp3

        val cp1: Component = Rotor(0, 0, alph, rotcfg)
        cp1.next = cp2

        val plugboard = Plugboard(pbcfg)
        plugboard.next = cp1

        next = plugboard
    }

}