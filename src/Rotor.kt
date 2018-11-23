package com.swet.enigma

class Rotor(sp: Int, lp: Int, alphabet: Alphabet, cfg: Map<Int, Int>) : Configuration(cfg) {

    private var latchPos = alphabet.shift(lp, sp)
    private var latchLock = false

    init {
        alph = alphabet
        config = config.entries.associate { (k, v) -> alph.shift(k, sp) to alph.shift(v, sp) }
    }

    override fun rotate() {
        next!!.rotate(latchPos)

        if (latchPos >= alph.getSize() - 1) {
            latchPos = 0
        } else {
            latchPos = latchPos++
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