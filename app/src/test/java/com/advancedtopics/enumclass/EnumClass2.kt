package com.advancedtopics.enumclass

enum class EnumClass2 {
    STARTED,
    PLAYING,
    GAMEOVER
}

fun changeState(currentState: EnumClass2): EnumClass2{
    if(currentState==EnumClass2.STARTED){
        return EnumClass2.PLAYING
    }else if(currentState==EnumClass2.PLAYING){
        return EnumClass2.GAMEOVER
    }else{
        return EnumClass2.GAMEOVER
    }
}

fun main(){
    println(changeState(EnumClass2.PLAYING))
    println(changeState(EnumClass2.GAMEOVER))
    println(changeState(EnumClass2.STARTED))
}