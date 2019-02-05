/*
  OOP :  객체 상속과 인터페이스를 통해서 이루어지는 코드의 추상화 + 모듈화
  Jaewook kang @ 190109
  ref: https://www.tutorialspoint.com/scala/scala_basic_syntax.htm
*/


object ScalaBasicSyntax {
  def main(args: Array[String]): Unit = {

    println("Variable in Scala Demo")
    println("---------------------------")

    /*
      Variable (val or var)
        - var : mutable variable (actual variable)
        - val : immutable variable (constant like variable )

        scala variable have three scopes
        - field: member variable of a certain class instance, accesible by every method of the instance
        - method args:  method arguments, accesible only by the method
        - local variable : declared inside methods, accessible only by the inside method

        노트1: 사실 스칼라 변수를 선언할때 type을 구체화 해 줄 필요는 없다 스칼라에서 알아서 찾아준다 --> 깔끔 코드
        노트2:
    */

    var myVar: Int = 50;
    // If you dont want to specify datatype:
    // var myVar = null
    val myVal: String = " Hello World! I've started learning Scala";

    println("myVar:", myVar);
    println("myVal:", myVal);

    myVar = 90
    //myVal = "Hello world" // this statement cause error !!

    println("myVar:", myVar);
    println("myVal:", myVal);


    var testVar: Int = 10;
    val testVal: Int = 10;

    testVar = testVar + 10;
    println("testVar:", testVar)
    //    testval = testVal + 10; // this statement cause error !!
    println("testVal:", testVal);

    println("---------------------------")
    println("함수값을 저장하는 변수")

    val min_result: Int = min(5,4)
    val add_result: Int = addInt(10,21)

    println("def min() =",min_result)
    println("def addInt() =",add_result)

    println("---------------------------")
    println(" Tuple of variables")
    val (myvar1, myvar2) = Pair(40,"dfa")
    val mytuple = Pair(40,"dfa")

  }
    /*
      - Methods
        def func_name ([list of params]) : return_type = {
            function body
            value to return
        }
        variations:
        - def func_name (arg1: arg1_type,...) : return_type = { statements}
        - def func_name (arg1: arg1_type,...) : return_type = statements
        - def func_name : return_type = statement
        - def func_name(arg1: arg1_type) : return type = statement + arg1

        If the method doesnot have return value, it does not include ":".
        - def func_name (arg1: arg1_type,..) { statement}

    */

    def min (x1: Int, x2: Int) : Int ={
      if (x1 < x2) x1 else x2
    }

    def addInt(x1: Int, x2: Int) : Int = {

      var sum: Int = 0;
      sum =  x1 + x2;
      return sum; // the return keyword is optional
    }


}

/*
  Packages
  Traits
  Linearization
  Java interoperability
*/
