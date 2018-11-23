package com.swet.enigma

class Alphabet(alph: String) {

    /*private val alphabets = listOf(
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z"

    )*/
    //"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val alph = alph

    fun shift(index: Int, offset: Int): Int {
        if (index + offset >= getSize()) {
            return index + offset - (getSize() - 1)
        } else {
            return index + offset
        }
    }

    fun shift(index: Int): Int {
        return shift(index, 1)
    }

    fun getSize(): Int {
//        return alphabet.length
        return alph.length
    }

    fun getChar(index: Int): Char {
//        return alphabets.get(index)
        return alph[index]
    }

    fun getIndex(ch: Char): Int {
        return alph.indexOf(ch)
    }

    fun getIndices(): IntRange {
//        return alphabets.indices
        return alph.indices
    }

}