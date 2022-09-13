import java.util.*

fun main(){
    val ler = Scanner(System.`in`)
    var entre0e25 = 0
    var entre26e50 = 0
    var entre51e75 = 0
    var entre76e100 = 0
    var numDigitado = 0

    while(numDigitado >= 0){
        println("Digite um número: ")
        numDigitado = ler.nextInt()
        if(numDigitado >=0 && numDigitado <= 25){
            entre0e25 += 1
        }else if (numDigitado >= 26 && numDigitado <= 50){
            entre26e50 += 1
        }else if (numDigitado >= 51 && numDigitado <= 75){
            entre51e75++
        }else if (numDigitado >= 76 && numDigitado <= 100){
            entre76e100++
        }
    }
    println("De 0 a 25: $entre0e25")
    println("De 26 a 50: $entre26e50")
    println("De 51 a 75: $entre51e75")
    println("De 76 a 100: $entre76e100")




}