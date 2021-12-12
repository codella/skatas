package dk.codella.skatas.calculator

import dk.codella.skatas.calculator.operator.Operator
import Operator.*

import scala.io.StdIn.{readDouble, readLine}
import Console.{GREEN, RED, RESET, in}
import scala.annotation.tailrec

@main def calculator(): Unit =
  val first = readOperand("First")
  val second = readOperand("Second")
  val operator = readOperator

  val result = calculate(first, second, operator)
  println(s"$RESET$GREEN$first ${operator.symbol} $second = $RESET$RED$result$RESET")

def calculate(first: Double, second: Double, operator: Operator) =
  operator match
    case Addition => first + second
    case Subtraction => first - second
    case Multiplication => first * second
    case Division => first / second

def readOperand(prompt: String) =
  print(s"$prompt: ")
  readDouble

val OPERATOR_REGEX = "[+-/*]".r

@tailrec
def readOperator: Operator =
  print("Operator (+, -, *, /): ")
  val matchedOperand = OPERATOR_REGEX.findFirstMatchIn(readLine).map(_.matched)
  matchedOperand match
    case Some("+") => Addition
    case Some("-") => Subtraction
    case Some("*") => Multiplication
    case Some("/") => Division
    case _ => readOperator
