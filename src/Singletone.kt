object singleton{

    init {
        println("Singleton object invoke")
    }

    var name="Kotlin objects"
    fun printName(){

        println(name)
    }
}

class A
{
  init {
      println("Class init method.Singletone name property:${singleton.name}")
      singleton.printName()

  }

}

fun main()
{
    singleton.printName()
    singleton.name="KK"
    var a=A()

}