/*
    პროგრამამ უნდა აჩვენოს ყველა მარტივი რიცხვი კლავიატურიდან გამოსულ ორ ინტერვალს შორის
*/

fun main() {

    println("შემოიტანე პირველი რიცხვი:")
    val startInterval = readLine()

    println("შემოიტანე მეორე რიცხვი:")
    val endInterval = readLine()

    printPrimeNumbers(startInterval!!.toInt(), endInterval!!.toInt())
}

fun printPrimeNumbers(start: Int, end: Int) {
    //ეს ცვლადი უნდა გამოიყენო ))
    var startInt = start
    while (startInt <= end) {
        var flag = false

        for (i in 2..startInt / 2) {
            // condition for nonprime number
            if (startInt % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            print("$startInt ")

        ++startInt
    }
    //მარტივად გააკეთებ while და for ციკლებით, ორივე შეგიძლია გამოიყენო
}

