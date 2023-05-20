package com.advancedtopics.myclasses.nestedClass1

fun main(){
}


class Car {

    private var myEngine = Engine()

    var speed =100
    fun drive(){
        myEngine.run()
        println("Driving the car..")
    }

    private inner class Engine{

        var rpm = 1000

        fun run(){
            this@Car.speed=110
            this@Car.drive()
            println("Engine is running..")
        }
    }

}