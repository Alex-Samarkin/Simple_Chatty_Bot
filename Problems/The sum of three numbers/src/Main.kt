import java.util.Scanner

// write your function here
fun sum(x1: Int, x2: Int, x3: Int): Int = x1 + x2 + x3

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}
