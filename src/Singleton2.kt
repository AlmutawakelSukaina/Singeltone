fun main()
{
    var a=AA()
}
object Singleton
{
    init {
        println("Singleton class invoked")
    }
    var Name="Singleton objetc"
   fun printName()
   {
       println(Name)
   }
}

 class AA
{
init {
    println("Class init method.Singletone name property:${Singleton.Name}")
    Singleton.printName()

}

}
