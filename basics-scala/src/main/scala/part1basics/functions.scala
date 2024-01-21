package main.scala.part1basics

object functions extends App {

                                  // Return type
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRepeatFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatFunction(aString, n-1)
  }
  println(aRepeatFunction("Hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionSide(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFUnction(a: Int, b: Int): Int = a + b

    aSmallerFUnction(n, n -1)
  }

  def Greetings(name: String, age: Int): Unit = {
    println("Hi my name is" + " "  + name + " " + "and I have " + age + " " + "years old")
  }
  Greetings("Everton", 25)

  def Factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * Factorial(n-1)
  }
  println(Factorial(5))

  def fibonacci (n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

      isPrimeUntil(n / 2)
  }
  println(isPrime(37))
}