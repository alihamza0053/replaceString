fun main(){
    var string = "api.bytewise.com/{path}/{student}/kotlin/{name}/{rollnumber}"
    println("running")
    var a = string.repleaseKeys("path" to "android","student" to "CS","name" to "hamza", "rollnumber" to "50")
    println(a)

}

fun String.repleaseKeys(vararg values: Pair<Any,String>): String{
    var result = this
    for ((key,value) in values){
        result = result.replace("{$key}",value.toString())
    }
    return resul
}