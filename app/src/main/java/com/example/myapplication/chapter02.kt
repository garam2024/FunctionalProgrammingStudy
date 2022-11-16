package com.example.myapplication

/*
Single Lambda Argument, it:

only one parameter for lambda expression (문맥에서 유추/ 추론)
람다 파라미터 정의를 생략하고 그냥 it 키워드로 인자를 사용
함수형으로 유명한 LINQ style 로 표현, readability 향상

Function Reference, Import As & Single Lambda Argument, It

Function Reference : 일종의 reflection, 함수 자체의 이름으로 함수 바디를 객체로써 참조함

Method Reference : ClassName :: FunctionName ; String :: isNotEmpty

import as : for name collision, locally rename that as another one
import my.Name // Name is accessible
import your.Name as yName //
yName is accessible for other Name type
*/

//DICE

enum class Hedron(val faces : Int){
    Terahedron(4), Cube(6), Octahedron(8), Dodecahedron(12)
}

class Dice(val size: Hedron) {
    fun cast()
}

fun main(args: Array<String>){

}