package com.swet.enigma

open class Configuration(protected var config: Map<Int, Int>) : Component() {

    // index transformation during a reflector to a plugboard
    fun decode(input: Int): Int {
        val reversed = config.entries.associate { (k, v) -> v to k }
        if (reversed.containsKey(input))
            return (reversed[input])!!
        return input
    }

    // index transformation during a plugboard to a reflector
    fun encode(input: Int): Int {
        if (config.containsKey(input)) {
            return (config[input])!!
        }
        return input
    }

    override fun substitute(input: Int): Int {
        val encoded = encode(input)
        if (next === null) {
            return decode(encoded)
        }
        val decodedByNext = next!!.substitute(encoded)
        return decode(decodedByNext)
    }

}