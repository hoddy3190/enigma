package com.altitude3190.enigma

class Rotor(sp: Int, lp: Int, alphabet: Alphabet, cfg: Map<Int, Int>) : Configuration(cfg) {

    var latchPos = alphabet.shift(lp, sp)
        private set
    var latchLock = false
        private set

    init {
        alph = alphabet
        config = config.entries.associate { (k, v) -> alph.shift(k, sp) to alph.shift(v, sp) }
    }

    override fun rotate() {
        if (next != null) {
            next!!.rotate(latchPos)
        }

        if (latchPos >= alph.getSize() - 1) {
            latchPos = 0
        } else {
            latchPos++
        }

        config = config.entries.associate { (k, v) -> alph.shift(k) to alph.shift(v) }
        latchLock = true
    }

    override fun rotate(prevRotorsLatchPos: Int) {
        if (prevRotorsLatchPos == latchPos && !latchLock) {
            rotate()
        } else {
            latchLock = false
        }
    }

}