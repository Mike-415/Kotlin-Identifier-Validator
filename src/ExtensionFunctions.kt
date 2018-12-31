/**
 * Created by Mike-415 on 12/30/18.
 */
fun List<Int>.sum(): Int {
    return reduce { acc, i ->  i + acc}
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}