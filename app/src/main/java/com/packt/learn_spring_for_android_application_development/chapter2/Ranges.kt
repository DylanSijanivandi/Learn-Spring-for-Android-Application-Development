package com.packt.learn_spring_for_android_application_development.chapter2

/**
 * Created by ihor_kucherenko on 9/16/18.
 * https://github.com/KucherenkoIhor
 */
fun ranges() {
    for (i in 0..100) {//for as long as "i" is a number from 1 to 100.
        //In Java it's for(int i = 0; i>=1 && i<=100; i++).
        //for (i in 0.rangeTo(100)) is an alternative.
        //for (i in 0 until 100) excludes 100.
        // .....
    }

    (0..100)
            .filter { it > 50 }
            .map { it * 2 }
}