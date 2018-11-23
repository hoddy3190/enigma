package com.swet.enigma

class Reflector(sp: Int, alphabet: Alphabet, cfg: Map<Int, Int>) : Configuration(cfg) {

    init {
        alph = alphabet
        config = cfg.entries.associate { (k, v) -> alph.shift(k, sp) to alph.shift(v, sp) }
    }

    override fun substitute(input: Int): Int {
        if (config.containsKey(input)) {
            return encode(input)
        }
        return decode(input)
    }

}