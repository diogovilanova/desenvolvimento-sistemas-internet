import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val nota1 = ler.nextFloat()//todos os numeros de entrada com casa decimal ou seja float
    val nota2 = ler.nextFloat()
    val nota3 = ler.nextFloat()
    val nota4 = ler.nextFloat()
    val media = (nota1 * 2 +  nota2 * 3 + nota3 * 4 + nota4 * 1) / 10 //media dos quatro numeros*pesos
    val media1 =  media.toString()

    if (media >= 7.0) {
        println("Media: " + media1)
        println("Aluno aprovado.")
    } else if (media < 5.0) {
        println("Media: " + media1)
        println("Aluno reprovado.")
    } else if (media >= 5.0  && media <= 6.9) {
        println("Media: " + media1)
        println("Aluno em exame.")
        val exame = ler.nextFloat()
        val exame1 = exame.toString()
        println("Nota do exame: " + exame1)
        val mediaFinal = (media + exame) / 2
        if (mediaFinal >= 5.0) {
            val mediaFinal1 = mediaFinal.toString()
            println("Aluno aprovado.")
            println("Media Final: " + mediaFinal1)
        }else if (mediaFinal <= 4.9) {
            println("Aluno reprovado.")
        }
    }
}