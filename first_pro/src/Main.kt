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



/*fun main() {
    var x:Int = readln().toInt()
    var fact: Int = factorial(x)
    var res: Boolean = even(fact)
    println(" fact $x = $fact  $res")

}

fun factorial(n:Int): Int{
    var fac:Int = 1
    for(i in 1 .. n){
        fac*=i
    }
    return fac
}

fun even(n:Int): Boolean{
    return (n % 2 == 0)
}*/


/*
fun main( ) {
    println(add(n2 = 6))
}


fun add (n1:Int = 5 , n2:Int ):Int {
    return n1 + n2
}*/


/*

fun main( ) {
    println(sum(1,1,2,4,87))
}

fun sum ( vararg nums:Int ): Int{
    var s =0
    for(i in 0 until nums.size ){
        s+=nums[i]
    }
    return s
}*/



/*
fun main( ) {
    println(plus(6))
}
var plus:(Int) -> Int = { n:Int -> n +5 }
*/


/*
fun main() { //lambda
    println(p1(6))
    println(p2(6))
    println(p3(6))
    println(p4(6))
    println(p5(6))
    // lmabda
}
var p1: (Int) -> Int ={n:Int -> n * 10}
var p2: (Int) -> Int = {n -> n * 10}
var p3: (Int) -> Int = {it -> it * 10}
var p4: (Int) -> Int = { it * 10}
var p5 ={n: Int -> n * 10}

*/

/*
fun main(){
    println(5.calc(2))
    println(5 calc 3)
}
infix fun Int.calc (n:Int)=this * n
*/


/*
fun main() {
    var r1=sum(3,5,{mul(2,5)})
    var r2=sum(3,5){mul(2,5)}
    println("r1=$r1")
    println("r2=$r2")
    println(fPrint({sayHi()}))
}
var sayHi : () -> Unit = {println("Hi")}
var mul : (Int, Int) -> Int = {n1 , n2 -> n1 * n2 }
fun sum (n:Int , m:Int , f:()-> Int) : Int {
    return n + m + f()
}
fun fPrint (f:()->Unit): Unit {
    f()
    println("pr")
}

*/


/*
fun main(){
    var nums = arrayOf(1,2,3,4,5)
    var sum =0
    for(i in 0 until nums.size){
        sum += nums[i]
    }
    print(sum)
}*/

/*
fun main(){
    var nums = arrayOf(1,-2,3,4,-5 ,0 ,8,-1,0)
    var pos =0
    var neg =0
    var zero =0
    for(i in 0 until nums.size){

        if (nums[i] > 0) pos++ else if (nums[i] < 0) neg++ else zero++
    }
    println("pos: $pos, neg: $neg, zero: $zero")
}*/


/*
fun main(){
    var nums = arrayOf(1,-2,3,4,-5 ,0 ,8,-1,0)
    var even =0
    var odd =0
    for(i in 0 until nums.size){

        if (nums[i] % 2 == 0) even++ else odd++
    }
    println("even: $even, odd: $odd")
}*/


/*
fun main(){
    var nums = arrayOf(1,-2,3,4,-5 ,0 ,8,-1,0)
    var min =nums[0]
    for(i in 1 until nums.size){
        if (nums[i] < min){
            min = nums[i]
        }
    }
    println( "min : ${min} " )
}*/


/*
fun main() {
    var nums = Array(5){
        readln().toInt()
    }
    for(i in 0 until nums.size){
        print(" array is : ${nums[i] }")
    }
}*/


/*
fun main (){
    var l =Array(5 ) {
        readln().toInt()
    }
    var avg = getAverage(l)
    println(avg)
}
fun getAverage (nums:Array<Int>):Int{
    var sum = 0
    for(num in nums){
        sum += num
    }
    return sum / nums.size
}*/


/*
fun main (){
    var list = intArrayOf(1,2,3,4,5)
    list.forEach { println(it) }
}*/

/*
fun main (){
    var list = intArrayOf(1,-2,3,4,-5,7)
    list.forEach { get(it) }
}
fun get (n: Int){

    if(n > 0) println(" $n pos  ") else println("$n neg ")
}*/

/*
fun main (){
   var l1=listOf<String>("akram","ahmad","mohamed","hasan","eid","fizh","gufrin","hysem")
    println(l1.filter{it.contains("a")})
    println(l1.filterNot{it.contains("a")})
    println(l1.get(2))
    println(l1.find{it.contains("akram")})
    var l2=l1.plus("akram").plus("mohaued")
    println(l2)
}*/

/*
fun main () {
    var l1 = listOf("akram", "ahmad", "mohamed", "hasan", "eid", "fizh", "gufrin", "hysem")
    var l2 = listOf("akram", "ahmad", "mohamed", "hasan", "eid", "fizh", "gufrin", "hysem")
    var lists = listOf(l1,l2)
    println(lists)
    println(lists.flatten())

}*/

/*
fun main () {
    var l1 =mutableListOf("akram", "ahmad", "mohamed", "hasan", "eid", "fizh", "gufrin", "hysem")
    l1[1]="abdo"
    println(l1)
}*/

/*
fun main () {
    var l = mutableSetOf(1,2,3,1,2,3,5,5,7,9,8)
    println(l.sorted())
}*/


/*
fun main () {
    var m1=mapOf("010" to "akram", "015" to "mohmed")
    var m2=mapOf(25 to "akram", 30 to "mohmed")
   m1.forEach { println(it) }
   m2.forEach { println(it) }
    println(m1.keys)
    println(m2.values)
    println(m1["010"])
    println(m2[30])
}
*/


/*fun main () {
    var m=HashMap<Int, String>()
    m.put(77,"ck")
    m.put(20,"r")
    m.put(93,"ak")
    m.put(48,"g")
    m.put(101,"e")
    var res = m.toList().sortedBy {( k , v) -> v }.toMap()
    for (i in res){
        println("key ${i.key}   value ${i.value}")
    }
    println("****************\n")
    res.forEach { println("key ${it.key}   value ${it.value}") }
}*/

