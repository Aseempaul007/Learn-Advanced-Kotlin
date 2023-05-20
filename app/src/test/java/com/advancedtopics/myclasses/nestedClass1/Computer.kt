package com.advancedtopics.myclasses.nestedClass1

class Computer {

    fun bootUp(){
        var myOs = OperationSystem()
        println("Booting up")
        myOs.startOS()
    }

    private inner class OperationSystem{

        fun startOS(){
            println("Operating system is starting..")
        }
    }
}


fun main(){
    var myC = Computer()
    myC.bootUp()
}