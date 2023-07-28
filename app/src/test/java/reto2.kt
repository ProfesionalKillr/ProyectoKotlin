class reto2 {
}
fun main(){
    println("Bienvenido, en supermercados Noè estamos en aniversario y te obsequiamos un descuento en el valor de tu compra, si esta es mayor a 50.000 y dependiendo tu suerte: ")
    println("ºSi sacas la bolita roja obtienes 10% en el valor de tu compra " )
    println("ºSi sacas la bolita azul obtienes un 30% en el valor de tu compra " )
    println("ºSi sacas la bolita amarilla obtienes un 50% en el valor de tu compra " )
    println("ºSi sacas la bolita blanca te llevas tu compra gratis ")
    println("Digite el valor de su compra: ")
    var num1= readLine()!!.toInt()
    if (num1>=50000){
        val bolita=(1..4).random()
        if(bolita==1) {
            var descuento=num1*0.10
            println("Tu compra es mayor a 50000! y tienes un descuento del 10%! , el precio total es ${descuento}")
        }
        else if(bolita==2) {
            var descuento=num1*0.3
            println("Tu compra es mayor a 50000! y tienes un descuento del 30%! , el precio total es ${descuento}")
        }
        else if(bolita==3) {
            var descuento=num1*0.5
            println("Tu compra es mayor a 50000! y tienes un descuento del 50%! , el precio total es ${descuento}")
        }
        else if(bolita==4) {
            println("Tu compra es mayor a 50000! y tu compra es totalmente gratis Felicidades!!")
        }
        else{
            println("Error")
        }
    }
    else {
        println("El total de tu compra es ${num1}")
    }
}