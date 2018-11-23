package com.swet.enigma

class SimpleEnigma() : Component() {

//    override val alph = Alphabet("ABCD")

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
            0 to 3
    )

    fun keystroke(ch: Char): Char {
        val index = this.alph.getIndex(ch)
        return alph.getChar(next!!.substitute(index))
    }

    init {

        alph = Alphabet("ABCD")


        var next: Component = Reflector(3, alph, refcfg)
//        setNextComponent(next)

        /*
        var cp = Rotor(3, 3, alph, rotcfg)
        cp.setNextComponent(next)
        next = cp
        setNextComponent(cp)

        var cp2 = Rotor(2, 2, alph, rotcfg)
        cp2.setNextComponent(next)
        next = cp2


        */
        var cp3 = Rotor(1, 1, alph, rotcfg)
        cp3.setNextComponent(next)
        next = cp3


        var cp4 = Plugboard(alph, pbcfg)
        cp4.setNextComponent(next)

        setNextComponent(cp4)
    }

}