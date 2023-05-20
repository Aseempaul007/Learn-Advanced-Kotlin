package com.advancedtopics.enumclass

enum class EnumClass3(var position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

fun main(){
    var olympics = Olympics()
    println(olympics.getMedal(2))
}

class Olympics(){

    fun getMedal(position: Int): EnumClass3{
        return when(position){
            1 -> EnumClass3.GOLD
            2 -> EnumClass3.SILVER
            3 -> EnumClass3.BRONZE
            else -> EnumClass3.NONE
        }
    }
}