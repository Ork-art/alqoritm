package com.example.alqoritm.alqoritms

/*
      Given an array of integers your solution should find the smallest integer.
*/
fun main() {
    val arrayList = listOf(12,34,49,57,65,54,21,78, 2)
    val triangleStars = Test()
    println(triangleStars.smaller(arrayList))

}
class Test {
     fun minNumber(numberList:List<Int>):Int{
         return numberList.sorted()[0]
     }

    fun number2(numberList:List<Int>){
        numberList.min()
        numberList.max()
    }
     //   listOf(12,34,49,57,65,54,21,78, 2)
    fun smaller(numberList: List<Int>):Int{
        var smallest = Int.MAX_VALUE
        for(n in numberList){
            if (n<smallest){
                smallest=n
            }
        }
        return smallest
    }

    fun index(numberListT: List<Int>, number:Int):Int{
        for(i in numberListT.indices){
            if (numberListT[i]== number){
                return i
            }
        }
        return -1
    }

}