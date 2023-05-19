package com.advancedtopics.dataclass


fun main(){
    var d1 = DataClass1("Aseem Paul","aseempal007@gmail.com","Aseem")
    println(d1)
}


data class DataClass1(
    var name: String,
    var email: String,
    var password: String
)
