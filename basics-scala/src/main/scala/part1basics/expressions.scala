package part1basics

object expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  val aCondition = true
  val aContionedValue = if (aCondition) 5 else 3
  println(aContionedValue)
  println(if (aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "GoodBye"
   }
  println(aCodeBlock)

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 236 else 986
    42
  }
  println(someOtherValue)
}