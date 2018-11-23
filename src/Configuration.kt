package com.swet.enigma

open class Configuration(config: Map<Int, Int>) : Component() {

    protected var config = config

    fun decode(input: Int): Int {
        val reversed = config.entries.associate { (k, v) -> v to k }
        if (reversed.containsKey(input))
            return (reversed[input])!!
        return input
    }

    fun encode(input: Int): Int {
        if (config.containsKey(input))
            return (config[input])!!
        return input
    }

    override fun substitute(input: Int): Int {
        return decode(next!!.substitute(encode(input)))
    }

}