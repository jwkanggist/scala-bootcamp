package Day3


object LoopStatement {

  def main (args: Array[String]): Unit ={

    val index = 0

    /*
        "for a to b" include b in the loop statement
        "for a until b" do not include b in the loop statement
     */
    for (index <- 1 to 5){
      println("for to statement:" + 2 * index)
    }

    for (index <- 1 until 5){
      println("for until statement:" + 2 * index)
    }

    while ( index < 5 ){
      println(" while statement" + 2* index)

    }


  }
}