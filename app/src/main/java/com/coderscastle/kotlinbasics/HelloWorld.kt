package com.coderscastle.kotlinbasics




fun main (args : Array<String>){

    val personObj = Person() //Object creation of Person class

    println("Hy , this is ${personObj.name}") //Interpolation of String

}


fun myDetails (){
    print("My name is Android")
}



class Person (){

    val name : String = "Android"
}