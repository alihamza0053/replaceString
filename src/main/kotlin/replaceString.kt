
fun main() {
    val string = "api.bytewise.com/{path}/{student}/kotlin/{name}/{rollnumber}"
    val result = string.replaceKeys("path" to "android", "student" to "yes", "name" to "kashif", "rollnumber" to 3314)
    println(result)
}

fun String.replaceKeys(vararg values: Pair<String, Any>): String {
    var result = this
    for ((key, value) in values) {
        val checkKey = "{$key}"
        if (result.contains(checkKey)) {
            result = result.replace(checkKey, value.toString())
        }
    }
    return result
}