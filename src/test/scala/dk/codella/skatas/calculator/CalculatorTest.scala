package dk.codella.skatas.calculator

import dk.codella.skatas.calculator.operator.Operator
import org.junit.Test
import org.junit.Assert.*

class CalculatorTest:
  @Test def canAdd(): Unit =
    val result = calculate(1, 3, Operator.Addition)
    assertEquals(4, result, 0.001)
