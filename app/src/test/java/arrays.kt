class arrays {
}
fun main(){
    val pets= arrayOf("dog","cat","canary")
    print(pets.contentToString())
    println(pets[1])
    pets[2]="parrot"
    println(pets.contentToString())

    for (element in pets){
        println("la mascota es $element")
    }

    for ((index,element)in pets.withIndex()){
        println("la mascota en la posicion $index es $element")

    }

    var instruments= mutableListOf("trumpet","piano","violin")
    val instrumentos:List<String> =listOf("trumpet","piano","violin")
    println(instruments[1])
    instruments
    println(instrumentos)
    ""
}