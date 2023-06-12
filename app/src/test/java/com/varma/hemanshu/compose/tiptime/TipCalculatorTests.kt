package com.varma.hemanshu.compose.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        // GIVEN - amount and tip percent
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        // WHEN - calculate tip is called
        val actualTip = calculateTip(amount, tipPercent, false)

        // THEN - validate the result
        assertEquals(expectedTip, actualTip)
    }
}