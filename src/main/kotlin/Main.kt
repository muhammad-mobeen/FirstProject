fun task11(n: Int){
    println("Task #1.1: Bottom Right Slant")
    for(i in 1..n)
    {
        println("#".repeat(i))
    }
    println("-------------------------------------------")
    println("")
}

fun task12(n: Int){
    println("Task #1.2: Top Right Slant")
    for(i in n downTo 1)
    {
        println("#".repeat(i))
    }
    println("-------------------------------------------")
    println("")
}

fun task13(n: Int){
    println("Task #1.3: Bottom Left Slant")
    for(i in 1..n)
    {
        println(" ".repeat(n-i) + "#".repeat(i))
    }
    println("-------------------------------------------")
    println("")
}

fun task14(n: Int){
    println("Task #1.4: Top Left Slant")
    for(i in n downTo 1)
    {
       println(" ".repeat(n-i) + "#".repeat(i))
    }
    println("-------------------------------------------")
    println("")
}

fun task15(n: Int){
    println("Task #1.5: Diamond")
    for(i in 1..n)
    {
        val noSpaces = (n-i)/2
        if(i%2 != 0)
        {
            println(" ".repeat(noSpaces) + "#".repeat(i))
        }
    }
    for(i in n downTo 1)
    {
        val noSpaces = (n-i)/2
        if(i%2 != 0)
        {
            println(" ".repeat(noSpaces) + "#".repeat(i))
        }
    }
    println("-------------------------------------------")
    println("")
}

fun task2(n: Int){
    println("Task #2: Christmas Tree")
    for(i in 1..n)
    {
        val noSpaces = (n-i)/2
        if (i%2 != 0)
        {
            println(" ".repeat(noSpaces) + "#".repeat(i))
        }

        if(i == n)
        {
            println(" ".repeat((n-3)/2) + "#".repeat(3))
        }
    }
    println("-------------------------------------------")
    println("")
}

fun task3(age: Int){
    println("Task #3.1: Check if a user’s age is in the range 1 to 10, 11 to 20, …, 41 to 50, or above.")
    when(age)
    {
        in 1..10 -> println("Range is 1-10")
        in 11..20 -> println("Range is 11-20")
        in 21..30 -> println("Range is 21-30")
        in 31..40 -> println("Range is 31-40")
        in 41..50 -> println("Range is 41-50")
        else -> println("Range is >50")
    }
    println("-------------------------------------------")
    println("")
}

fun task4(n: Int, m: Int){
    val rndNumber = (n..m).random()
    var tries = 1
    while(true)
    {
        print("Try #$tries\nPlease guess a number between 1 and 100: ")
        var userNumber = readln().toInt()
        if(userNumber > rndNumber)
        {
            println("Oops! Your guess was too high. Try Again!")
            println("-------------------------------------------")
            println("")
        }
        else if(userNumber < rndNumber)
        {
            println("Oops! Your guess was too low. Try Again")
            println("-------------------------------------------")
            println("")
        }
        else if(userNumber == rndNumber)
        {
            println()
            println("*******************************************")
            println("Wow! You got it on try $tries!")
            println("*******************************************")
            break
        }
        tries++
    }
}

fun classTask1(m: Int, n: Int): Int{
    return m+n
}

fun classTask2(str: String): String{
    return str.reversed()
}

fun classTask3(arr: Array<Int>): Int{
    var sum = 0
    for(i in arr)
    {
        sum += i
    }
    return sum/arr.size
}

fun classTask4(chr: Char, str: String): Int{
    return str.filter { it==chr }.count()
}

fun classTask5(x: Int, y: Int): Int{
    if(x>y)
    {
        return x
    }
    else
    {
        return y
    }
}

fun classTask6(intList: Array<Int>):MutableList<Int>{
    var evenList = mutableListOf<Int>()
    for(i in intList)
    {
        if(i%2==0)
        {
            evenList.add(i)
        }
    }
    return evenList
}

fun classTask7(str: String):Int{
    return str.split("\\s+".toRegex()).size
}

fun main(){
    val n = 10
//    task11(n)
//    task12(n)
//    task13(n)
//    task14(n)
//    task15(n)
//    task2(n)
//    task3(20)
//    task4(1,100)
//    classTask(10,90)
    println("Task1: Sum of two Integers: "+(classTask1(2,3)).toString())
    println("Task2: String Reverse: "+ classTask2("Mobeen"))
    println("Task3: Average of Int Array: "+(classTask3(arrayOf(1,2,3,4))).toString())
    println("Task4: Count of char: "+(classTask4('e',"Mobeen")).toString())
    println("Task5: Return Greater Number: "+(classTask5(2,3)).toString())
    println("Task6: Return Even List: "+(classTask6(arrayOf(1,2,3,4))).toString())
    println("Task7: Return Number of words: "+(classTask7("I am Muhammad Mobeen")).toString())
}