package com.swet.enigma

class Reflector(sp: Int, alphbet: Alphabet, config: Map<Int, Int>) : Configuration(config) {

//    override val config = config

    override fun substitute(input: Int): Int {
        if (config.containsKey(input)) {
            return encode(input)
        }
        return decode(input)
    }

//    fun plugboard() {
//
//    }
}