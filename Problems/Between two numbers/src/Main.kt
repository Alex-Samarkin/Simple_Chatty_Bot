import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n1 = scanner.nextInt()
    val r = scanner.nextInt()..scanner.nextInt()
    println(n1 in r)
}