package Day3
/*
    Scala has both functions and methods and
    we use the terms method and function interchangebly with a mibor difference.

    A scala method is a part of a class which has a name, a signature, optionally some annotation,
    and some bytecode

    A function in Scala is a complete object which can be
    assigned to a variable,

    In other word, a function, which is defined as a member of some object, is called a method.

 */

object Functions {
  def main(args: Array[String]): Unit = {

    println("Returned Value:" + addInt(5,7))
  }

  def addInt (a: Int, b: Int) : Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}