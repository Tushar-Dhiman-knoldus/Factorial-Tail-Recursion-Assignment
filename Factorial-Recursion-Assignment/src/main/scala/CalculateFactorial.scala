package com.knoldus.factorial

import scala.annotation.tailrec

case class CalculateFactorial() {

  def factorial(number: BigInt): BigInt = {
    if (number < 0) throw new IllegalArgumentException()
    else {
      @tailrec
      def tailRecursionFactorial(number: BigInt, accumulator: BigInt): BigInt = {
        if (number <= 1) accumulator
        else tailRecursionFactorial(number - 1, number * accumulator)

      }
      tailRecursionFactorial(number, 1)
    }
  }
}
