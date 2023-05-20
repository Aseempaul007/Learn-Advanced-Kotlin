package com.advancedtopics.OtherConcepts

open class Car {
}

class BMW: Car(){

}

class Cycle{

}

fun main(){
    var myCar = BMW()

    if(myCar !is BMW){
        println("This is general car")
    }else{
        println("This is BMW")
    }
}