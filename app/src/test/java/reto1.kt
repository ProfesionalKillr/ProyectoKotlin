class reto1 {
}
fun main(){
    println("Bienvenido a Craps, aca puedes ganas si:" +
            "1.Sacas un par de unos en los dados" +
            "2.Sacas un total de 3 en los dados" +
            "3.Sacas un total de 11 en los dados" +
            "4.Sacas un numero entre 2 y 12 en los dados" +
            "5.Sacas un total de 7 en los dados" +
            "De lo contrario Perdiste")
    println("Escribe tu nombre y podremos empezar: ")
    val nombre =readLine()
    val dado1=(1..6).random()
    val dado2=(1..6).random()
    var resultado= dado1+dado2
    if(resultado==1){
        println("${nombre} , haz sacado un par de unos, Ganaste!")
    }
    else if(resultado==3){
        println("${nombre} , haz sacado un total de 3, Ganaste!")
    }
    else if(resultado==11)
    {
        println("${nombre} , haz sacado un total de 11, Ganaste!")
    }
    else if(resultado==2 || resultado==12)
    {
        println("${nombre} , haz sacado un total de ${resultado}, Ganaste!")
    }
    else if(resultado==7)
    {
        println("${nombre} , haz sacado un total de 7, Ganaste!")
    }
    else{
        println("${nombre} , haz sacado un total de ${resultado}, Perdiste")
    }
}