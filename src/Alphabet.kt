package com.swet.enigma

class Alphabet(private val alph: String) {

    fun shift(index: Int, offset: Int): Int {
        if (index + offset >= getSize()) {
            return index + offset - getSize()
        }
        return index + offset
    }

    fun shift(index: Int): Int {
        return shift(index, 1)
    }

    fun getSize(): Int {
        return alph.length
    }

    fun getChar(index: Int): Char {
        return alph[index]
    }

    fun getIndex(ch: Char): Int {
        return alph.indexOf(ch)
    }

    fun getIndices(): IntRange {
        return alph.indices
    }

}