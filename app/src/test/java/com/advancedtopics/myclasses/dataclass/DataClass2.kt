package com.advancedtopics.myclasses.dataclass

data class DataClass2(
    var name: String,
    var email: String,
    var productsBought: String
)

fun main(){

    var cust1 = DataClass2("Aseem","aseempal007@gmai.com","Banana")
    var cust2 = DataClass2("Bhawna","karan@gmai.com","Banana")
    var cust3 = DataClass2("Satyam","sadhna@gmai.com","Banana")
    var cust4 = cust1.copy(email = "Anupaul")

    var customers = arrayListOf<DataClass2>()
    customers.add(cust1)
    customers.add(cust2)
    customers.add(cust3)
    customers.add(cust4)

    sendEmail(customers)



}

fun sendEmail(customers: ArrayList<DataClass2>){
    for(customer in customers){
        println("Hi ${customer.name} you bought ${customer.productsBought}")
    }
}
