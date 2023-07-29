class Nequi {
}
fun login():Boolean {
    var op:Int=1
    var veces:Int=0
    var estado:Boolean
    var intentos:Int=3
    var numT=3213881602
    var clave=1234
    println("Nequi!")
    do{
        veces+=1
        intentos-=1
        println("Ingresa el número de telefono")
        var numT1:Long= readLine()!!.toLong()
        println("Ingresa el pin de 4 dígitos")
        var clave1:Int= readLine()!!.toInt()
        if (numT==numT1 && clave==clave1){
            estado=true
            break
        }else{
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes $intentos intentos más")
            estado=false
        }
        if (veces>=3){
            println("Acceso Denegado")
            estado=false
            break
        }
        println("Quieres volver a intentarlo? 1.si/2.no")
        op= readLine()!!.toInt()
    }while (op==1)
    return estado
}
fun saca(saldo:Int?):Int{
    if (saldo!!<2000) {
        println("No te alcanza para retirar, tienes")
        return 1
    } else{
        println("Puedes elegir entre:\n" +
                "1 cajero\n" +
                "2 punto físico")
        var d:Int= readLine()!!.toInt()
        println("Cuánto deseas retirar?")
        var retirar:Int= readLine()!!.toInt()
        if (retirar>saldo!!) {
            println("Tu saldo es menor de lo que quieres retirar")
            return 2
        }else {
            return saldo-retirar
        }
    }
}
fun envia(saldo: Int?):Int{
    println("Digite el número de telefono")
    var numT:Int= readLine()!!.toInt()
    println("Digite el dinero que le enviará")
    var dinero:Int= readLine()!!.toInt()
    if (dinero>saldo!!) {
        println("No es posible enviar el dinero")
        return 1
    }else {
        return saldo-dinero
    }
}

fun recargar(saldo: Int?):Int{
    println("Cuanto desea recargar?")
    var recarga:Int= readLine()!!.toInt()
    println("Seguro que quiere recargar $recarga? si/no")
    var d:String= readLine().toString()
    if (d=="si"){
        return saldo!!+recarga
    }else{
        println("Error")
        return 1
    }
}
fun recargaCelular(saldo: Int?):Int{
    println("Ingresa el número de telefono: ")
    var numT:Int= readLine()!!.toInt()
    println("Ingresa el operador: ")
    var op:Int= readLine()!!.toInt()
    println("Ingresa el valor de la recarga: ")
    var recarga:Int= readLine()!!.toInt()
    if (recarga>saldo!!){
        println("Ayy!, el dinero no te alcanza")
        return 1
    }else{
        return saldo-recarga
    }
}
fun pagarFactura(saldo: Int?):Int{
    println("Ingresa el número de la factura")
    var factura:Int= readLine()!!.toInt()
    println("Ingresa el valor de la factura")
    var valor:Int= readLine()!!.toInt()
    if (valor>saldo!!){
        println("Ayy!, el dinero no te alcanza")
        return 1
    }else{
        return saldo-valor
    }
}
fun main(){
    var login=login()
    if (login==true){
        var saldo:Int=0
        var op:Int=1
        do {
            println("Tu saldo actualmente es $saldo, puedes: ")
            println("1 Sacar dinero")
            println("2 Envía dinero")
            println("3 Recarga dinero")
            println("4 Recarga de celular")
            println("5 Pagar Factura")
            println("6 Salir del app")
            var opcion:Int= readLine()!!.toInt()
            when (opcion){
                1->{
                    var result=saca(saldo)
                    if (result==1){
                        print("Debes tener más de 2000 en saldo")
                    }else if(result==2){
                        println("Ingresa un valor que este dentro de tu saldo")
                    } else{
                        var cod:Int=(100000..999999).random()
                        println("Código para retirar $cod")
                        saldo=result
                    }
                }
                2->{
                    var envia=envia(saldo)
                    if (envia==1){
                        println("Debes enviar un valor menor o igual al que tienes")
                    }else{
                        println("Dinero enviado exitosamente, tu saldo es $envia")
                        saldo=envia
                    }
                }
                3->{
                    var recargar= recargar(saldo)
                    if (recargar==1){
                        println("Tu saldo es $saldo")
                    }else{
                        saldo=recargar
                    }
                }
                4->{
                    var recargarCelular= recargaCelular(saldo)
                    if (recargarCelular==1){
                        println("Uy, no tienes el suficiente dinero")
                    }else{
                        saldo=recargarCelular
                    }
                }
                5->{
                    var pagarfactura= pagarFactura(saldo)
                    if (pagarfactura==1){
                        println("Uy, no tienes el suficiente dinero")
                    }else{
                        saldo=pagarfactura
                    }
                }
                6 ->{
                    println("Gracias por usar nequi")
                    break
                }
            }
            println("Quieres seguir utilizando el nequi? 1.si/2.no")
            op= readLine()!!.toInt()
        }while (op==1)
    }
}