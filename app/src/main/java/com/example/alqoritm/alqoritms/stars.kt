package com.example.alqoritm.alqoritms


//*
//**
//***
//****

fun main() {
    star()
    println()
    starReverse()
}


fun star(){
    val a = "*"
    for (i in 0..4){
        for (j in 0..i){
            print(a)
        }
        println()
    }
}
//****
//***
//**
//*
fun starReverse(){
    val a= "*"
    for (i in 4 downTo 0){
        for (j in 0..<i){
            print(a)
        }
        println()
    }
}