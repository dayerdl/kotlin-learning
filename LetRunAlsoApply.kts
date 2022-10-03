import java.util.Calendar

repeat(3) { rep ->
    println("current repetition: $rep")
}

val letTest = Calendar.getInstance().let {
    1
}

println("-->letTest $letTest")

val testRun = Calendar.getInstance().run {
    "david"
}

println("--> testRun $testRun")

val test  = Calendar.getInstance().also {
    1
}

println("-->test $test")

val testApply  = Calendar.getInstance().apply {
    1
}

println("-->test $testApply")


//inline fun <T, R> T.let(block: (T) -> R): R
//
//inline fun <T, R> T.run(block: T.() -> R): R
//
//inline fun  T.also(block: (T) -> Unit): T
//
//inline fun  T.apply(block: T.() -> Unit): T


inline fun createString(block: StringBuilder.(String) -> Unit): String {
    val sb = StringBuilder()
    sb.block("hola ")
    return sb.toString()
}

val result = createString { it -> this.append(it).append("david") }

println("${result}")


inline fun createString2(block: (String) -> Unit): String {
    block("que pasa ")
    return "David"
}

println("${createString2 {
    it -> print("hola $it")
}}")