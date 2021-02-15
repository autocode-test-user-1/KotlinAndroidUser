package com.example.kotlinandroiduser

class Calc {
    fun add(a: Double, b: Double): Double {
        return a + b
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        val y = a - b
        return y
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) return 0.0
        return a / b
    }

    fun emptyFun() {

    }
}