package com.swet.enigma

class Plugboard(alphabet: Alphabet, config: Map<Int, Int>) : Configuration(config) {

//    constructor(config: Map<Int, Int>) : super(config)

    override fun substitute(input: Int): Int {
        if (next != null) {
            next!!.rotate()
            return super.substitute(input)
        }
        return encode(input)
    }

}