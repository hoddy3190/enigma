package com.swet.enigma

class Plugboard(config: Map<Int, Int>) : Configuration(config) {

    override fun substitute(input: Int): Int {
        if (next != null) {
            next!!.rotate()
        }
        return super.substitute(input)
    }

}