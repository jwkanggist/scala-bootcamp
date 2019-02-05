
package Day3

/*
  private type

  In Scala, the access (new Inner).
  f() is illegal because f is declared private in Inner and
  the access is not from within class Inner.
  By contrast, the first access to f in class Innermost is OK,
  because that access is contained in the body of class Inner.
  Java would permit both accesses
  because it lets an outer class access private members of its inner classes.
 */
class Outer {
  class Inner {

    private def f() {println("f")}

    class InnerMost {
      f()
    }
  }
  //(new Inner).f() // Error : f is not accessible

  val a = Day2.HelloWorld
}

/*
   protected type

   부모 클래스를 상속한 자식 클래스에서만 접근이 가능한 클래스
 */

package p {

  class Super {
    protected def f() {println ("f")}
  }

  class Sub extends Super {
    f() // f() is accesible by a child class of Super which is Sub
  }

  class Other {
    //(new Super).f() // Error : f is not accessible by Sub
  }
}


object AccessModifiers {

  def main(args: Array[String]): Unit ={

    val outer = new Outer

    // test packaged object
    outer.a.main(Array("None"))

  }
}