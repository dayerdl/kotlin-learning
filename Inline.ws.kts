inline fun higherOrderFunction(lambda: () -> Unit) {

    doSomething()
    lambda()
    doAnotherThing()

}

fun doSomething() {}

fun doAnotherThing() {}

fun callingFunction() {

    for (i in 0..4) {
        higherOrderFunction { print("lambda logic") }
    }

}

callingFunction()