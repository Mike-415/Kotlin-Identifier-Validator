/**
 * Created by Mike-415 on 12/30/18.
 */

fun isValidIdentifier(s: String): Boolean {
    fun hasUnderscoreOrAlphabets(ch: Char) = ch == '_' || ch.isLetter()
    if (s.isEmpty() || !hasUnderscoreOrAlphabets(s[0])) return false
    for (ch in s) {
        if (!(hasUnderscoreOrAlphabets(ch) || ch.isDigit())) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}