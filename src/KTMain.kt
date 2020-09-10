/*
შეცვალე მოცემულ ორ რიცხვის ადგილები:
 1. მესამე ცვლადის გამოყენებით,
 2. მესამე ცვლადის გარეშე.

 მაგალითად, თუ გაქვს a=2 და b=7, საბოლოოდ უნდა გქონდეს a=7 და b=2.
*/

var firstNumber = 26
var secondNumber = 7
var a=0
var b=0

fun main() {

    println("შეცვლამდე: a = $firstNumber, b = $secondNumber")
    swapTwoNumbersWithTemp(firstNumber,secondNumber)git checkout newBranch


            println("მესამე ცვლადის გამოყენებით: a = $a, b = $b")
    swapTwoNumbersWithoutTemp(firstNumber,secondNumber)

    println("მესამე ცვლადის გარეშე: a = $a, b = $b")
}

//მესამე ცვლადის გამოყენებით
fun swapTwoNumbersWithTemp(firstNumber: Int, secondNumber: Int) : Pair<Int,Int> {
    a=firstNumber
    b=secondNumber
    var c=a
    a=b
    b=c

    return Pair (a,b)
}

//მესამე ცვლადის გარეშე
fun swapTwoNumbersWithoutTemp(firstNumber:Int, secondNumber: Int): Pair<Int,Int> {


    a=firstNumber
    b=secondNumber
    a=a-b
    b=a+b
    a=b-a

    return Pair(a,b)
}