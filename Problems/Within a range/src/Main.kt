import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val r1 = scanner.nextInt()..scanner.nextInt()
    val r2 = scanner.nextInt()..scanner.nextInt()
    val n1 = scanner.nextInt()

    println((n1 in r1)or(n1 in r2))
}