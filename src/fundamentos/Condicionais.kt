package fundamentos

fun exemplo_when(numero: Int) {
    when (numero) {
        1 -> println("Um")
        2 -> println("Dois")
        3, 4 -> println("Três ou Quatro") // Vários valores

        in 5..10 -> println("Entre 5 e 10") // Intervalos
        else -> println("Outro número") // Caso padrão
    }
}

fun main() {
    var x = 4
    var y = 7

    if (x > y){
        println("X e maior que Y")
    }else if (x.equals(y)){
        println("X e igual a Y")
    }else{
        println("X e menor que Y")
    }

    val mensagem = if (x > 0) true else false
    println("$mensagem")

    exemplo_when(x)
}