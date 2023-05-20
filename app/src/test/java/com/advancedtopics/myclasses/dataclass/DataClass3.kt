package com.advancedtopics.myclasses.dataclass

data class DataClass3(
    var title: String,
    var content: String,
    var noOfReaders: Int
)

fun main(){

    var articles = arrayListOf<DataClass3>()
    articles.add(DataClass3("The wall","great wall of china",322))
    articles.add(DataClass3("Work flow","from us to india",1267))
    articles.add(articles[0].copy(title = "The wall og china"))

    println(articles)
}
