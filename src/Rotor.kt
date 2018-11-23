package com.swet.enigma

class Rotor(sp: Int, lp: Int, alphabet: Alphabet, config: Map<Int, Int>) : Configuration(config) {

    private var latchPos = alphabet.shift(lp, sp - 1)
    private var latchLock = false

    init {
        alph = alphabet
    }

    override fun rotate() {
        if (latchPos >= alph.getSize() - 1) {
            latchPos = 0
        } else {
            latchPos = latchPos++


        }


        config = config.entries.associate { (k, v) -> alph.shift(k) to alph.shift(v) }


//        latchLock = true
    }

    fun rotate(prevRotorslatchPos: Int) {
        if (prevRotorslatchPos == latchPos && !latchLock) {
            rotate()
        } else {
            latchLock = false
        }
    }

}