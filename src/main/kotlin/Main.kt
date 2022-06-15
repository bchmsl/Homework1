fun main(args: Array<String>) {
    sum()
}


fun sum() {
    val x: Int
    val y: Int
    println("Enter value of X: ")
    val _x = readLine()
    try {
        x = _x!!.toInt()
    } catch (e: Exception) {
        println("Invalid value")
        sum()
        return
    }
    println("Enter value of Y: ")
    val _y = readLine()
    try {
        y = _y!!.toInt()
    } catch (e: Exception) {
        println("Invalid value")
        sum()
        return
    }
    val z = x + y
    println("Sum for $x and $y is $z")
    askIfStartOver()
}

fun askIfStartOver() {
    println("Do you want to start over? Y/N")
    val answer = readLine()
    when (answer) {
        "y" -> sum()
        "Y" -> sum()
        "n" -> return
        "N" -> return
        else -> {
            println("Invalid value")
            askIfStartOver()
            return
        }
    }
}