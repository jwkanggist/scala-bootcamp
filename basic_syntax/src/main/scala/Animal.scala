


/*
  class
  Role: class declaration for object instantiation

  Format:
  class class_name {

  // class member values
  var animalName
  var ...

  // class member methods
  def method1(arg1: arg_type) return_type = {
  }
    ...
  }
 */


class Animal {

  var animalName: String= "noset"
  var animalAge:  Int = -1

  def setAnimalName(animalName:String) {
    this.animalName = animalName
  }

  def setAnimalAge (animalAge:Int) {
    this.animalAge = animalAge
  }

  def getAnimalName(): String ={
    return this.animalName
  }

  def getAnimalAage(): Int={
    return this.animalAge
  }

  def isAnimalNameSet: Boolean ={
    if (getAnimalName == "noset") false else true
  }

}

/*
    object

    Role:
    - 1) an instance object of a certain class
    - 2) an singleton instance object: a single object of a class can exist

    Format:

    object object_name {
      def main(arg_name: arg_type): return_type ={
        }
      }

 */

// A companion objects of the class Animal
object Animal{
  def main(args: Array[String]): Unit ={
    val obj: Animal = new Animal
    var flag: Boolean = false

    obj.setAnimalName("dog")
    flag = obj.isAnimalNameSet
    println("obj.AnimalNamte=",obj.getAnimalName())
    println("flag:",flag)

    obj.setAnimalName("noset")
    flag = obj.isAnimalNameSet
    println("obj.AnimalName=",obj.getAnimalName())
    println("flag:",flag)

  }
}
