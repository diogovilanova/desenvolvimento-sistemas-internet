import java.util.*

fun main() {
    val ler = Scanner(System.`in`) //scanner como entrada de dados, depois criar duas variaveis de entrada.

    val precos = floatArrayOf(4.00f,4.50f,5.00f,2.00f,1.50f) /*floatArrayOf para criar uma matriz com floats,
    a ordem dos preços e codigo estão conforme a tabela.
*/
    val codigo = ler.nextInt()//variavel de entrada com o codigo do produto (inteiro).
    val quantidade = ler.nextInt()//variavel de entrada com a quantidade do produto (inteiro).

    System.out.printf("Total: R$ %.2f%n",(quantidade*precos[codigo-1]))//printar na tela o valor total como float com duas casas.
}