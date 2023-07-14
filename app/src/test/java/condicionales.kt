class condicionales {
}
fun main(){
    /*println("Digite el primer numero: ")
    val n1 = readLine()!!.toInt()
    println("Digite el segundo numero: ")
    val n2 = readLine()!!.toInt()

    if(n1 > n2){
        println("${n1} es mayor que ${n2}" )
    }
    else if(n1==n2){
        println("${n1} y ${n2} son iguales")
    }
    else if(n1<n2){
        println("${n2} es mayor que ${n1}")
    }
    else {
        println("Error")
    }*/

    //var random=(1..20).random()
    /*
    println("Digite un numero del 1 al 20: ")
    var n1= readLine()!!.toInt()
    if(n1 in 1..20)
    {
        println("El numero esta en el rango")
    }
    else {
        println("Te dije!!, un numero del 1 al 20")
    }*/


    /*var results=20
    when (results){
        0 -> println("No results")
        in 1..39 -> println("Got results!")
        else -> println("That's a lot of results!")
    }*/
    var random=(1..50).random()
    when (random){
        0 -> println("No results")
        in 1..10 -> println("Hay ${random} coincidencias o menos")
        in 21..50 -> println("Hay ${random} coincidencias")
    }
}