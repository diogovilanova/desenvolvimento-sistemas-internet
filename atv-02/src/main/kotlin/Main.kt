import java.util.Scanner

fun main(){
    val ler = Scanner(System.`in`)
    val alturaLista: ArrayList<Double> = ArrayList()

    for (i in 0..14){
        println("Digite a altura: ")
        val altura:Double = ler.nextDouble()
        alturaLista.add(altura)
    }
    val max = alturaLista.maxOrNull() ?: 0
    val min = alturaLista.minOrNull() ?: 0
    println("A menor altura do grupo: %.2f".format(min))
    println("A maior altura do grupo: %.2f".format(max))
}