/*

  */


/*
 fun main() {
    var x = 5
    var y = 7
    var sum = x + y
    println(" sum = ${sum}"
}
  */

//fun main() {
//    val x : Int = 9
//    val y : Double = 10.3
//    val z  = (x + y) .toInt()
//    println(z)
//}


//fun main(args : Array<String>) {
//    var n: Byte =131.toByte()
//    println(n)
//}

/*
fun main() {
    println("Hello, \n hi \n welcome ")

    println(""" hello
        |hi
        |welcome
    """.trimMargin())

    println("5+5")
    println(5+5)
    println(" 5 + 5 = ${5+5} ")
}
*/

/*
fun main() {
    val n1 = 5
    val n2 = 15
    var res: Int
    var rem: Int


    res = n1 + n2
    println("sum = $res")

    res = n1 - n2
    println("sub = $res")

    res = n1 * n2
    println("mul = $res")

    res = n2 / n1
    println("div = $res")

    rem = n2 % n1
    println("rem = $rem")
}*/

/*
fun main (){
    var n1 = 125
    var n2 = 5 + n1++
    println(n2)
    println(n1)
}
  */


/*
fun main (){
    var n1 : Int=  10
    n1+= 2
    println(n1)

    n1-= 5
    println(n1)

    n1*= 5
    println(n1)

    n1/= 5
    println(n1)

    n1%= 5
    println(n1)
}*/

/*fun main() {
    var n1: Int = 5
    var n2: Int = 10
    println(n1 > n2)
    println(n1 < n2)
    println(n1 >= n2)
    println(n1 <= n2)
    println(n1 == n2)
    println(n1 != n2)
}*/


/*
fun main() {
    var num : Int =12
    if (num % 2 == 0) {
        println("even")
    }else{
        println("odd")
    }
}*/


/*
fun main() {
    var age : Int =18
    if (age >= 18 && age <= 100) {
        println("adul")
    }else if(age >= 1 && age <18) {
        println("under")
    }else{
        println("error")
    }
}*/

/*fun main() {
    var age : Int
    age = if (5 > 2) 20 else 30
    println(age)
    }*/


/*fun main() {
    var num : Int = 15
    when (num % 2 ) {
        0 -> print("even")
        1 -> print("odd")
    }
}*/

/*
fun main() {
    val name : String = "se"
    when (name) {
        "jan","feb" -> println("winter")
        "aug","sep" -> println("sammer")
        else -> println("erorr")
    }
}*/


/*
fun main() {
    var age : Int?
    age=null
}*/

/*

fun main() {
    var pro = readLine()!!.toInt()
    while (pro > 0) {
        var x : Int = readLine()!!.toInt()
        var y : Int = readLine()!!.toInt()
        println(" + ")
        println(" - ")
        println(" * ")
        println(" / ")
        var op = readLine()
        when (op) {
            "+" -> println("${x} + ${y} = ${x + y}")
            "-" -> println("${x} - ${y} = ${x - y}")
            "*" -> println("${x} * ${y} = ${x * y}")
            "/" -> println("${x} / ${y} = ${x / y}")
        }
    }
}*/


/*
fun main() {
    for (i in 1 .. 10) {
        println(i)
        for (j in 1 .. 10) {
            println("$i * $j = ${i * j} ")
        }
        println("\n")
    }
}*/


/*
fun main() {
    var i: Int = 1
    while (i <= 10){
        println("i = ${i}")
        i++
    }
}*/


/*
fun main() {
    var num:Int? = null
    println( num!!.toLong() )
}*/


/*
fun main() {
    var name :String? = "ak"
    var l:Int = if (name != null) name.length else -1
    var len :Int = name?.length ?: -1
    println(l)
    println(len)
}*/


/*
fun main() {
    var num :Int = readLine()!!.toInt()
    println(num +5 )

    var age:Int = readln().toInt() // not null
    println(age + 5)
}*/

/*
fun main() {
    var text: String? = "Kotlin"
    println(text?.uppercase())
}*/

/*
fun main() {
    var num:Int = readln().toInt()
    var fac:Int = 1
    for (i in 1..num) {
        fac *= i
    }
    println("fac = ${fac}")
}*/

/*
fun main() {
    var num:Int = readln().toInt()
    var result:Int = num * (num + 1)/2
    println( "result = ${result}" )
}*/


/*
fun main() {
    var base:Int = readln().toInt()
    var power:Int = readln().toInt()
    var result = 1
    for(i in 1..power ) {
        result *= base
    }
    println(" $base ^ $power = $result")
}*/


/*fun main() {
    var result=0
    for (i in 'a'..'z')
        println( " $i = ${i.code - 32 } " )
}*/



/*
fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}*/

/*
fun main() {
    var number:Int = readln().toInt()
    var sum: Int = 0
    while(number != 0) {
        var d:Int = number % 10
        sum += d
        number /= 10
    }
    println(sum)
}*/



/*fun main() {
    var number:Int = readln().toInt()
    var copyNum:Int = number
    var sum: Int = 0
    while(number != 0) {
        var d:Int = number % 10
        sum = sum*10 + d
        number /= 10
    }
    println(sum)
    if(copyNum == sum){ // 1991
        println("palindrome")
    }else{
        println("not palindrome")
    }
}*/


