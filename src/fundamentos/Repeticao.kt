package fundamentos

fun para(){
    for (i in 1..5) {
        println(i)  // Imprime de 1 a 5
    }

    for (i in 1 until 5) {
        println(i)  // Imprime de 1 a 4
    }

    for (i in 5 downTo 1 step 2) {
        println(i)  // Imprime 5, 3, 1
    }
    println("\n\n")
}

fun enquanto(){
    var com = 0
    while (com < 10){
        println(com)
        com += 1
    }

    println("\n\n")
}

fun faca_enquanto(){
    var num = 0
    do {
        println(num)
        num++
    }while (num < 10)

    println("\n\n")
}

fun main() {
    para()
    enquanto()
    faca_enquanto()
}