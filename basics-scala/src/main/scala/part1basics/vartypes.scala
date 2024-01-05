package part1basics

object vartypes extends App {

  //val é imutavel / tipagem dinamica
  val x: Int = 42
  println(x)

  val aString: String = "Hello"
  val anotherString = "Goodbye"
  println(aString)
  println(anotherString)

  val aboolean: Boolean = true
  val aChar: Char = 'x'
  val aInt: Int = 2
  val aShort: Short = 4613
  val aLong: Long = 2312312343242L
  val aFloat: Float = 3.0f
  val aDouble: Double = 2.4


  //variaveis / são mutaveis
  var aVariable: Int = 4
  aVariable = 2 //Side effects
}