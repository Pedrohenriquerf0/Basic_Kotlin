package fundamentos

fun soma(x: Int, y: Int): Int{
    return x + y
}

fun subtracao(a: Int, b: Int) = a - b // Função de uma unica linha

fun imprimir_msg(){
    println("Ola, Mundo")
}

fun saudar(nome: String = "Visitante"){ // Função com valor padrão no paramento
    println("Ola, $nome")
}

fun main() {
    println(soma(5, 2))
    println(subtracao(10, 5))
    imprimir_msg()
    saudar()
    saudar("Pedro")

    // Função Lambda
    val multicador = {p: Int, h: Int -> p * h}
    println(multicador(4, 5))


}