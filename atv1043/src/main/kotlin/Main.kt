import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val A = ler.nextFloat()
    val B = ler.nextFloat()
    val C = ler.nextFloat()

    if (A >= B + C || B >= A + C || C >= A + B) {
        val areaTringulo = (A + B) * C / 2
        val areaTri = String.format("%.1f", areaTringulo)
        println("Area = " + areaTri)
    } else {
        val perimetroTriangulo = A + B + C
        val perimetroTri = String.format("%.1f", perimetroTriangulo)
        println("Perimetro = " + perimetroTri)
    }
}