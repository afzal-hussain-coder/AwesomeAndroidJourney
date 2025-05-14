fun add(a: Int, b: Int): Int = a + b

fun isEven(n: Int): Boolean = n % 2 == 0

fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) result *= i
    return result
}

fun maxOfThree(a: Int, b: Int, c: Int): Int {
    return when {
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }
}

fun printOneToTen() {
    for (i in 1..10) {
        println(i)
    }
}

fun printEvenNumberOneToTen(){
    for(i in 1..10){
        if(i % 2 ==0){
            println("Even Number is : $i")
        }
    }
}

fun main() {
    println("Add: " + add(5, 3))
    println("Is Even: " + isEven(4))
    println("Factorial: " + factorial(5))
    println("Max: " + maxOfThree(10, 25, 20))
    printOneToTen()
    printEvenNumberOneToTen()
}
