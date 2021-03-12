package com.packt.learn_spring_for_android_application_development.chapter2

/**
 * Created by ihor_kucherenko on 9/12/18.
 * https://github.com/KucherenkoIhor
 */


val readOnly = 3// Variables can be declared outside the scope of classes.
var mutable = 3// In Java it would be a non-private static variable within a class,
// because everything in java has to be a class.

fun changeMutable() {// functions can be declared outside the scope of classes.
// In Java it would be a static method within a class because everything in java has to be a class.
    mutable = 4
}

class Foo {// A variable varies, a value does not.
    val readOnly = 3
    var mutable = 3

    fun changeMutable() {
        mutable = 4
    }
}

class Bar {
    companion object {// variables within the companion object are static.
        const val NAME = "Igor"

        fun printName() = println(NAME)
    }
}

fun test() {//The below variable and function can be accessed without their class being instantiated,
    //because they are static.
    Bar.NAME
    Bar.printName()
}




//fun collection() {
//    List()
//}