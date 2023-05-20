package com.advancedtopics.myclasses.nestedClass1

class Airplane {

    fun startAirplane(){
        println("Starting engine 1")
        Engine().startingEngine()
        println("Airplane is ready to take off")
    }
    private inner class Engine{

        fun startingEngine(){
            println("Starting engine 2")

        }
    }
}


fun main(){
    var myAirplane = Airplane()
    myAirplane.startAirplane()
}