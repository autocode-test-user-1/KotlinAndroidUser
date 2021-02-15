package com.example.kotlinandroiduser

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalcSecondTest {
    private lateinit var cacl: Calc

    @Test
    fun calc_second_add_isCorrect() {
        cacl = Calc()
        assertEquals(5.0, cacl.add(2.5, 2.5), 0.1)
    }

    @Test
    fun calc_second_subtract_isCorrect() {
        cacl = Calc()
        assertEquals(1.0, cacl.subtract(3.3, 2.3), 0.1)
    }

    @Test
    fun calc_second_multiply_isCorrect() {
        cacl = Calc()
        assertEquals(10.0, cacl.multiply(100.0, 0.1), 0.1)
    }

    @Test
    fun calc_second_divide_isCorrect() {
        cacl = Calc()
        assertEquals(10.0, cacl.divide(100.0, 10.0), 0.1)
        assertEquals(0.0, cacl.divide(10.0, 0.0), 0.1)
    }
}