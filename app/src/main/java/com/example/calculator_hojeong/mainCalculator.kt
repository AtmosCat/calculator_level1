package com.example.calculator_hojeong

fun main() {
    var calculatorName = "호정의 계산기 Lv1"

    var calc = Calculation()

    println("연산을 진행할 첫 번째 값을 입력해주세요.")
    var num1 = readLine()!!.toInt()
    println("연산을 진행할 두 번째 값을 입력해주세요.")
    var num2 = readLine()!!.toInt()

    var additionResult : Int = calc.add(num1, num2)
    var subtractionResult : Int = calc.subtract(num1, num2)
    var multiplicationResult : Int = calc.multiply(num1, num2)
    var divisionResult : Int = calc.divide(num1, num2)

    println("어떤 연산을 진행하실래요?(더하기/빼기/곱하기/나누기 중 입력)")
    var calculationOption = readLine()!!

    if (calculationOption == "더하기") {
        println("더하기 연산을 수행합니다.")
        println(additionResult)
    } else if (calculationOption == "빼기") {
        println("빼기 연산을 수행합니다.")
        println(subtractionResult)
    } else if (calculationOption == "곱하기") {
        println("곱하기 연산을 수행합니다.")
        println(multiplicationResult)
    } else if (calculationOption == "나누기") {
        println("나누기 연산을 수행합니다.")
        println(divisionResult)
    } else {
        println("옵션값이 잘못되었습니다.")
    }
}

class Calculation {
    fun add(a: Int, b: Int) : Int {
        return a + b
    }
    fun subtract(a:Int, b: Int) : Int {
        return a - b
    }
    fun multiply(a: Int, b: Int) : Int {
        return a * b
    }
    fun divide(a: Int, b: Int) : Int {
        return a / b
    }
}
