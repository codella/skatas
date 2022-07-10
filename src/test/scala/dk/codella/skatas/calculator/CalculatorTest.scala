package dk.codella.skatas.calculator

import dk.codella.skatas.calculator.operator.Operator

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class CalculatorTest extends munit.FunSuite {
  test("canAdd") {
    val result = calculate(1, 3, Operator.Addition)
    assertEquals(result, 4.0)
  }
}