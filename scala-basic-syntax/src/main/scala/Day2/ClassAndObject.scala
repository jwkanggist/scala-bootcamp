package  Day2

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


// A companion objects of the class Animal
object ClassAndObject{
  def main(args: Array[String]): Unit ={
    val obj: ClassAndAnimalObject = new ClassAndAnimalObject
    val extendObj: ClassAndAnimalObjectExcepetion = new ClassAndAnimalObjectExcepetion

    var flag: Boolean = false

    obj.setAnimalName("dog")
    flag = obj.isAnimalNameSet
    println("obj.AnimalName=",obj.getAnimalName())
    println("flag:",flag)

    obj.setAnimalName("noset")
    flag = obj.isAnimalNameSet
    println("obj.AnimalName=",obj.getAnimalName())
    println("flag:",flag)

    extendObj.setAnimalName("dog")
    extendObj.setAnimalAge(11)
    extendObj.setAnimalWeightKg(24)
    flag = extendObj.isAnimalNameSet
    println("extendObj.AnimalName =", extendObj.getAnimalName())
    println("extendObj.AnimalAge =", extendObj.getAnimalAge())
    println("extendObj.AnimalWeightKg=", extendObj.getAnimalWeightKg())
    println("flag:",flag)

  }
}




class ClassAndAnimalObject {

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

  def getAnimalAge(): Int={
    return this.animalAge
  }

  def isAnimalNameSet: Boolean ={
    if (getAnimalName == "noset") false else true
  }

}

/*
    Expending class

    - 부모클래스를 상속하여 자식 클라스를 생성
    - extends 키워드 사용
    - class 전달 인자에 override 키워드를 붙여줘야 한다.

 */

class ClassAndAnimalObjectExcepetion extends ClassAndAnimalObject{

  var animalWeightKg = 54

  def setAnimalWeightKg (animalWeightKg: Int): Unit = {
    this.animalWeightKg = animalWeightKg
  }

  def getAnimalWeightKg (): Int ={
    this.animalWeightKg
  }
}

/*
    object:


    Role:
    - 1) an instance object of a certain class
    - 2) an singleton instance object: a single object of a class can exist
    ==> 여기서는 2번으로 사용하고 있음
    ==> 싱글톤 객체로 사용하기 위해서 object 키워드를 통해서 선언한다.
    ==>

    Format:

    object object_name {
      def main(arg_name: arg_type): return_type ={
        }
      }

 */
