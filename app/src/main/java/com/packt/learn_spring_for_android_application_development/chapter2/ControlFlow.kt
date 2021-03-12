package com.packt.learn_spring_for_android_application_development.chapter2

/**
 * Created by ihor_kucherenko on 9/16/18.
 * https://github.com/KucherenkoIhor
 */

fun ifStatement() {
    val a = 4
    if (a < 5) {
        println(a)
    }
}

fun ifExpression() {
    val a = 5
    val b = 4
    val max = if (a > b) a else b// if "a" is bigger than "b", set "max" to a, else set "max" to b
}

fun whenStatement() {
    val x = 1
    when (x) {// switch statement
        1 -> println("1")
        2 -> println("2")
        else -> {
            println("else")
        }
    }
}

fun whenExpression(x: Int) = when (x) {// A function that is declared similar to a variable,
    // this is a feature of functional programming.
        // var myVar = whenExpression(Int x)
    1 -> println("1")
    2 -> println("2")
    else -> {
        println(x)
    }
}

sealed class Method
class POST: Method()
class GET: Method()

fun handleRequest(method: Method): String = when(method) {
    is POST -> TODO("Handle POST")
    is GET -> TODO("Handle GET")
}
