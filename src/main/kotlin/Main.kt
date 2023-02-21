fun main(args: Array<String>) {

    val a: A = object :A(){
        override fun a() {
          println("Hellow")
        }
    }

    a.a()

}

abstract  class  A{
    abstract  fun a()
}