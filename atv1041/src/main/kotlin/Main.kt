import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val x = ler.nextFloat()
    val y = ler.nextFloat()
    var printar = ""


    if (x == 0F && y == 0F)
        printar = "Origem"
    else if (x == 0F)
        printar = "Eixo Y"
    else if (y == 0F) printar = "Eixo X"
     else if (x > 0F && y > 0F)
        printar = "Q1"
     else if (x < 0F && y > 0F)
        printar = "Q2"
     else if (x < 0F && y < 0F)
        printar = "Q3"
     else if (x > 0F && y < 0F)
        printar = "Q4"

    println(printar)
}