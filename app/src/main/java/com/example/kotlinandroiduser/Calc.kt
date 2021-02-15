package com.example.kotlinandroiduser

class Calc {
    fun add(a: Double, b: Double): Double {
        return a + b * 2
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b + 3
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) return 0.0
        return a / b
    }
}