package com.advancedtopics.enumclass

enum class EnumClass1(var times: Int) {
    RED(22),
    BLUE(37),
    GREEN(11)
}

fun main(){
    println(EnumClass1.RED.times)
    println(EnumClass1.RED.name)
    println(EnumClass1.RED.ordinal)
    decide(EnumClass1.RED)
}
fun decide(color: EnumClass1){

    when(color){
        EnumClass1.RED -> println("Color is Red")
        EnumClass1.BLUE -> println("Color is BLUE")
        EnumClass1.GREEN -> println("Color is GREEN")
        else -> println("No color")
    }
}