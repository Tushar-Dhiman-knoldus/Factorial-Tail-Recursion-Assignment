package com.knoldus.factorial

import org.scalatest.funsuite.AnyFunSuite

class CalculateFactorialTest extends AnyFunSuite {

   val calculateFactorial_object: CalculateFactorial = CalculateFactorial()

   test("Factorial of 0 is 1") {
     assert(calculateFactorial_object.factorial(0) == 1)
  }

  test("Factorial of 4 is 24") {
    assert(calculateFactorial_object.factorial(4) == 24)
  }

  test("Factorial of 5 is 120") {
    assert(calculateFactorial_object.factorial(5) == 120)
  }

  test("Factorial of 6 is 720") {
    assert(calculateFactorial_object.factorial(6) == 720)
  }

  test("Factorial of 10 is 3628800") {
    assert(calculateFactorial_object.factorial(10) == BigInt("3628800"))
  }

  test("Factorial of 15 is 1307674368000") {
    assert(calculateFactorial_object.factorial(14) == BigInt("87178291200"))
  }

  test("Factorial of a negative number should throw an IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      calculateFactorial_object.factorial(-1)
    }
  }

}
