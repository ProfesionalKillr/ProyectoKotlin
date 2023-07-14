import kotlin.jvm.internal.Ref.ByteRef

class Introduccion {

}

fun main(){
    /*println("Mi primera vez")
    val n1: Byte = 1
    val n2: Short =1234
    val n3: Int = 1234567
    val n4: Long = 1234567890123456789
    println(n1)
    println(n2)
    println(n3)
    println(n4)*/
    println("Digite su nombre: ")
    var nombre= readLine()
    println ("Digite su apellido: ")
    var apellido =readLine()
    println("Digite su edad '${nombre}'")
    var edad= readLine()!!.toInt()
    val edadf= edad+10

    println("En 10 años, ${nombre} ${apellido} tendra ${edadf}")

}







