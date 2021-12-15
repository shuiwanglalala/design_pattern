package refactoring_guru.kotlin

class Test {
}

fun main() {
    val test = Test()

//    print(test)
    var s1 = student("ssss", 1)
    s1.like = false
    var s2 = student("ssss", 1)
    s2.like = true
    println(s1 == s2)
    println(s1 === s2)
}

data class student (var name: String, var age: Int) {
    var like: Boolean? = null
}