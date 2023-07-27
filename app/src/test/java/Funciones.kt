class Funciones {
}
/*fun printHello(name: String?): Unit{
    println("Hola mundo")
}*/
fun PerimetroCirculo(){
    println("Digite el radio del circulo: ")
    var radio1= readLine()!!.toDouble()
    var resultado1= 2*(3.1416*radio1)
    println("El perimetro del circulo es ${resultado1}")
}
fun AreaCirculo(){
    println("Digite el radio del circulo: ")
    var radio1= readLine()!!.toDouble()
    var resultado1= 3.1416*(radio1*radio1)
    println("El perimetro del circulo es ${resultado1}")
}

fun PerimetroTriangulo(lado1:Double, lado2:Double, lado3:Double){
    var resultado= lado1+lado2+lado3
    if(lado1==lado2 && lado2==lado3){
        println("El perimetro del triangulo es: ${resultado} y el triangulo es EQUILATERO" )
    }
    else if(lado1==lado2 && lado2!=lado3){
        println("El perimetro del triangulo es: ${resultado} y el triangulo es ISOSELES" )
    }
    else if(lado1!=lado2 && lado2!=lado3){
        println("El perimetro del triangulo es: ${resultado} y el triangulo es ESCALENO" )
    }


}
fun AreaTriangulo(base:Double, altura:Double){
    var resultado= (base*altura)/2
    println("El area del triangulo es: ${resultado}" )
}
fun PerimetroRectangulo(lado:Int?): Int{
    return 4*lado!!
}



fun main(){
//Funcion por expresion
    /*
    val temperatura=20
    val isHot=if(temperatura>40)true else false

    print(isHot)
    println("Digite su edad ")
    var edad= readLine()!!.toInt()

    if(edad >= 18){
        print("Bienvenido!")
    }
    else{
        print("Pa la casa")
    }
    printHello()*/

    var op=0
    while(op==0) {
    println("Bienvenido," +
            "1.Calcular Perimetro del circulo" +
            "2.Calcular Area del circulo" +
            "3.Calcular Perimetro del triangulo" +
            "4.Calcular Area del triangulo")
    var n1= readLine()!!.toInt()
        
        if (n1 == 1) {
            PerimetroCirculo()
        } else if (n1 == 2) {
            AreaCirculo()
        } else if (n1 == 3) {
            println("Digite el lado 1 del triangulo")
            var lado1 = readLine()!!.toDouble()
            println("Digite el lado 2 del triangulo")
            var lado2 = readLine()!!.toDouble()
            println("Digite el lado 3 del triangulo")
            var lado3 = readLine()!!.toDouble()
            PerimetroTriangulo(lado1, lado2, lado3)
        } else if (n1 == 4) {
            println("Digite la base del triangulo")
            var base = readLine()!!.toDouble()
            println("Digite la altura del triangulo")
            var altura = readLine()!!.toDouble()
            AreaTriangulo(base, altura)
        }
        else if (n1==5){
            println("Digite ")
            var per= readLine()!!.toDouble()
            PerimetroRectangulo(lado)
        }
        else {
            println("Error")
        }
        println("Desea continuar? 0=si 1=no")
        op = readLine()!!.toInt()
    }



}