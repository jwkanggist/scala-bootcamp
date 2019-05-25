package  Day2

class Point(val xc: Int,  val yc: Int){
  var x : Int = xc
  var y : Int = yc



  def move (dx: Int, dy: Int): Unit = {

    x = x + dx
    y = y + dy
  }

}

object SingletonObject {

  def main(args: Array[String]): Unit = {

    val point = new Point(10,20)
    printPoint

    def printPoint: Unit ={

      println("Point x location:" + point.x)
      println("Point y location:" + point.y)
    }
  }
}