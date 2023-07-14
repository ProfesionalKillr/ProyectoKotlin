class Ciclos {
}
fun main(){
    /*for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 1..10 step 2) print(i)
    println()
    for (i in 10 downTo 1 step 2)print(i)
    println()
    for(i in 'a'..'e')print(i)
    println()*/
    /*print("Digite un numero: ")
    val i =readLine()*/
    /*for (i in 1..10)
        if(i==1 || i==3 || i==5 || i==7 || i==9){
            println("El numero ${i} es impar")
        }
        else if(i==2 || i==4 || i==6 || i==8 || i==10){
            println("El numero ${i} es par")
        }*/

    /*for (i in 1..10) {
        var number: Int = i % 2
        if (number == 0) {
            println("El numero ${i} es impar")
        } else {
            println("El numero ${i} es par")
        }
    }*/

    /*fun main() {
        println("digite el inicio de numeros ")
        var ini= readLine()!!.toInt()
        println("digite el limite de numeros ")
        var lim= readLine()!!.toInt()
        var pr=0
        var ipr=0
        var pa=0
        var per=0
        for (i in ini..lim) {
            var n = i % 2
            if (ini >=1) {
                if (n == 0) {
                    pr = pr + 1
                    pa = pa + i
                } else {
                    per = per + i
                    ipr = ipr + 1
                }
            }
            else{
                println("debe ser mayor a cero")
                break
            }
        }
        println("$pr son numeros pares y su sumatoria es $pa y $ipr son impares y su sumatoria es $per")

    }*/




    var contador:Int=0
    var contadorno:Int=0
    var sumapares:Int=0
    var sumaimpares:Int=0
    /* for(i in 1..4){
         println("Digite el numero")
         var number:Int= readLine()!!.toInt()
         if (number<=0 ){
            break
         }

         else {
             var validacion:Int=number%2
             if (validacion==0){
                 contador=contador+1
                 sumapares=sumapares+number
             }
             else {
                 contadorno=contadorno+1
                 sumaimpares=sumaimpares+number
             }
         }
     }*/
    var confi:Int=1
    while(confi==1){
        println("Digite el numero")
        var number:Int= readLine()!!.toInt()
        if (number<=0 ){
            break
        }

        else {
            var validacion:Int=number%2
            if (validacion==0){
                contador=contador+1
                sumapares=sumapares+number
            }
            else {
                contadorno=contadorno+1
                sumaimpares=sumaimpares+number
            }
        }
        println("¿Desea ingresar otro numero 1. si 2. No?")
        confi= readLine()!!.toInt()
    }
    println("Los numeros pares fueron $contador")
    println("Los numeros impares fueron $contadorno")
    println("La suma de los numeros pares fue $sumapares")
    println("La suma de los numeros impares fue $sumaimpares")
}




