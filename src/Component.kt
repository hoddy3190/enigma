package com.swet.enigma

open class Component() {

    protected var next: Component? = null
    protected lateinit var alph: Alphabet

    open fun rotate() {
        // please override me
    }

    open fun rotate(prevRotorsLatchPos: Int) {
        // please override me
    }

    open fun substitute(input: Int): Int {
        // please override me
        return input
    }

    fun setNextComponent(n: Component) {
        next = n
    }

}
