package com.advancedtopics.myclasses.dataclass


fun main(){
    var d1 = DataClass1("Aseem Paul","aseempal007@gmail.com","Aseem")
    var d2 = DataClass1("Aseem Paul","aseempal007@gmail.com","Aseem")
    println(d1)
    println(d1.toString())
    println(d1.equals(d2))
    var d3 = d1.copy("","","")
    println(d3)

}


data class DataClass1(
    var name: String,
    var email: String,
    var password: String
)
