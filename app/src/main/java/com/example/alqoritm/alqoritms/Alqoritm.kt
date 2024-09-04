package com.example.alqoritm.alqoritms

//number ə görə arraylistində index qaytarmaq


fun main() {
    val index = Index()
    val indexFind = index.findIndex(5)

    println(indexFind)

}


class Index {
    val listIndex = listOf(1,2,4,5,6,7,8,62,35)

    fun findIndex(numberFind:Int):Int{
        for (i in listIndex.indices){
            if (listIndex[i]== numberFind){
                return i
            }
        }
        return -1
    }
}