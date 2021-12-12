package dk.codella.skatas.calculator.operator

enum Operator(val symbol: Char):
  case Addition extends Operator('+')
  case Subtraction extends Operator('-')
  case Division extends Operator('/')
  case Multiplication extends Operator('*')