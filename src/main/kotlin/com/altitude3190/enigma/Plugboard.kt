package com.altitude3190.enigma

class Plugboard(config: Map<Int, Int>) : Configuration(config) {

    override fun substitute(input: Int): Int {
        if (next != null) {
            next!!.rotate()
        }
        return super.substitute(input)
    }

}