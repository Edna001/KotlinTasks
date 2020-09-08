/*
შეცვალე მოცემულ ორ რიცხვის ადგილები:
 1. მესამე ცვლადის გამოყენებით,
 2. მესამე ცვლადის გარეშე.

 მაგალითად, თუ გაქვს a=2 და b=7, საბოლოოდ უნდა გქონდეს a=7 და b=2.
*/

var firstNumber = 26
var secondNumber = 7

fun main() {

    println("შეცვლამდე: a = $firstNumber, b = $secondNumber")
    swapTwoNumbersWithTemp()

    println("მესამე ცვლადის გამოყენებით: a = $firstNumber, b = $secondNumber")
    swapTwoNumbersWithoutTemp()

    println("მესამე ცვლადის გარეშე: a = $firstNumber, b = $secondNumber")
}

//მესამე ცვლადის გამოყენებით
fun swapTwoNumbersWithTemp() {}

//მესამე ცვლადის გარეშე
fun swapTwoNumbersWithoutTemp() {}