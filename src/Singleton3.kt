class A3{
init {
    println("Class init method")
}
    companion object singletonB{
        init {
            println("SingletonB Class invoked")
        }
        var name="Kotlin objetc B"
        fun printName()
        {
            println(name)
        }
    }
    object singletonA {
        init {
            println("SingletoneA class invoked")
        }

        var Name = "Kotlin Object A"
        fun printName() {
            println(Name)
        }
    }

}

fun main()
{
    var aa=A3()
     var n=A3.name
    A3.name="Kotlin Tutorials"
   A3.printName()

}