import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    println("Tabuada de: ")
    val n = scan.nextInt()
    var tabuada = 0

    for (num in 1..10){
        tabuada = n * num
        println("$num x $n = $tabuada")
    }

}