package com.example.kotlinandroiduser

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalcTest {
    private lateinit var cacl: Calc

    @Test
    fun calc_add_isCorrect() {
        cacl = Calc()
        assertEquals(4.0, cacl.add(2.0, 2.0), 0.1)
    }

    @Test
    fun calc_subtract_isCorrect() {
        cacl = Calc()
        assertEquals(1.0, cacl.subtract(3.0, 2.0), 0.1)
    }

    @Test
    fun calc_multiply_isCorrect() {
        cacl = Calc()
        assertEquals(12.0, cacl.multiply(6.0, 2.0), 0.1)
    }

    @Test
    fun calc_divide_isCorrect() {
        cacl = Calc()
        assertEquals(1.0, cacl.divide(2.0, 2.0), 0.1)
        assertEquals(0.0, cacl.divide(2.0, 0.0), 0.1)
    }
}