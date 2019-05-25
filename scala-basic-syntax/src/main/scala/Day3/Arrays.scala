package Day3

import Array._


object Arrays{
  def main(args: Array[String]): Unit = {

    var myList  = Array(1.9,2.9,3.4,3.5)
    var myList2 = Array(2.3,5.4,2.3,5.5)

    var myConcatList = concat(myList,myList2)
    var rangeList = range(0,10,2)

    // Print all the array elements
    for ( x <- myList) {
      println(x)
    }

    var total = 0.0
    for (i <- 0  to (myList.length -1)){

      total += myList(i)
    }
    println("Total is "+ total)

    // Finding the largest element
    var max = myList(0)
    for (i <- 1 to (myList.length -1 )){
      if (myList(i) > max ) max = myList(i)
    }
    println("Max is " +max)


    for ( i <- myConcatList ){
      println("myConcatList: "+i)
    }

    for ( i <-rangeList){
      println("rangeList: " + i)
    }
  }
}


