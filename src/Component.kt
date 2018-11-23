package com.swet.enigma

open class Component() {
//    constructor() : this()

    protected var next: Component? = null
    protected lateinit var alph: Alphabet
//    protected val alph = alph

    fun successors() {

    }

    open fun rotate() {
        // please override me
    }

    open fun substitute(encode: Int): Int {
        // please override me
        return 0
    }


    fun setNextComponent(n: Component) {
        next = n
    }

//    fun setAlph(a: Alphabet) {
//
//    }
}