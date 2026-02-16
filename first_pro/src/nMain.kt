
/*
fun main() {
    val text :String="4.2"
    val result :Double =(text.toDoubleOrNull() ?: 0.0) + 1.0
    println(result)
}*/


/*
fun main() {
    val res = area(5.0)
    println("area : $res cm ")
}
fun area (n: Double): Double {
    val pi = 3.141592653589793
    return n * n * pi
}*/


/*
fun main() {
    var temp=readln().toFloat()
    println(getTemp(temp))
}
fun getTemp(n: Float):String{
    return when(n){
        in Float.NEGATIVE_INFINITY .. 0f -> "freez"
        in 0f..10f-> "cold"
        in 10f..20f-> "cool"
        in 20f..30f-> "warm"
        in 30f..40f-> "hot"
        else -> "error"
    }
}*/


/*

fun main() {
    val x : Int = readln().toInt()
    println(fizzBuzz(x))
}

fun fizzBuzz(number : Int) : List<String> {
    val list:MutableList<String> = mutableListOf()
    for(i in 1..number) {
        val solu= calc(i)
        list.add(solu)
    }
    return list
}

fun calc (n : Int) : String {
    return when {
        n % 3 == 0 && n % 5 == 0 -> "FizzBuzz"
        n % 3 == 0  -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> n.toString()
    }
}
*/


/**
 * ##check
fun main() {
    check(name = "when enter 1 return 1", result =calc(1), correctResult = "1")
    check("when enter 3 return Fizz",calc(3),"Fizz")
    check("when enter 5 return Buzz",calc(5),"Buzz")
    check("when enter 15 return FizzBuzz",calc(15),"FizzBuzz")
    check("when enter 14 return 14",calc(14),"14")
}

fun check(name : String , result:String , correctResult: String)  {
    if(result == correctResult) println("Sucsses - $name")
    else println("Falied - $name ")
}*/



/*
fun main() {
    var x :List<Int> = readln().split(" ").map { it.toInt() }
    println(getFirstEvenNumberIndex(x))
}

fun getFirstEvenNumberIndex(numbers: List<Int>): Int{
    numbers.forEachIndexed { index, number ->
        if (number % 2 ==0 ) {
            return index
        }
    }
    return -1
}*/


/*
fun main() {
    var x :List<Int> = readln().split(" ").map { it.toInt() }
    var y : Int = readln().toInt()
    var z = getNumber(x,y)

    println("The number $y appears $z times")
}

fun getNumber(list: List<Int> , n: Int ): Int{
    var sum = 0
    list.forEach{
        if( n == it) {
            sum++
        }
    }
    return sum
}*/


/*

import kotlin.math.abs

fun main() {
    println(hasDuplicates(listOf(-1,1,1,-1)))
    println(hasDuplicates(listOf(1,2,3,1,5,2,2)))
    println(hasDuplicates(listOf(1,2,3,4,5,67,8)))
    println(hasDuplicates(listOf()))
}
fun hasDuplicates(numbers: List<Int>): Boolean{
    var seen  = mutableSetOf<Int>()
    numbers.forEach { num ->
        val ignor= abs(num)
        if(ignor in seen){
            return true
        }
        seen.add(num)
    }
    return false
}*/


/*
fun main() {
    val t:String = readln()
    println(isPalindrome(t))
}
fun isPalindrome(input: String): Boolean{
    var text=input.lowercase().filter { it.isLetterOrDigit() }
    var lPointer=0
    var rPointer=text.length-1
    while( lPointer < rPointer ){
        if (text[lPointer] != text[rPointer]){
            return false
        }
        lPointer++
        rPointer--
    }
    println(text)
    return true
}*/


/*
fun main() {
    val t:String = readln()
    println(isPalindrome(t))
}
fun isPalindrome(input: String): Boolean{
    return input == input.reversed()
}*/


/*
fun main() {
    println(isValidparentheses(")()())"))
    println(isValidparentheses("(()())"))
}
fun isValidparentheses(input: String): Boolean{
    val stack = mutableListOf<Char>()
    for (char in input) {
        if (char == '(') {
            stack.add(char)
        }else if(char == ')') {
            if (stack.isEmpty()) {
                return false
            }
            stack.removeAt(stack.lastIndex)
        }
    }
    return stack.isEmpty()
}*/


/*
fun main() {
    println(areAngrams("abc","cba"))
    println(areAngrams("levb","cba"))
    var x ="levb"
    var y =x.toCharArray().sorted()
    println(y)
}
fun areAngrams(firstInput: String , secondInput: String): Boolean{
    return firstInput.toCharArray().sorted() == secondInput.toCharArray().sorted()
}*/




/*
import java.util.UUID
fun main() {
    val b1 = BankAccount("Ak")
    b1.deposit(10000)
    b1.withdraw(2000)
    b1.deposit(10)
    println(b1.transferMoney())
    println(b1.getBalance())
}

class BankAccount(val name:String){
    val accountid: UUID = UUID.randomUUID()
    private  var balance =0
    private  var transactions: MutableList<Int> =mutableListOf()



    fun deposit(amount: Int) {
        balance += amount
        transactions.add(amount)
    }

    fun withdraw(amount: Int):Boolean {
        if(amount <= balance){
            balance -= amount
            transactions.add(-amount)
            return true
        }else{
            return false
        }
    }

    fun getBalance():Int{
        return balance
    }
    fun transferMoney() {
        println()
        println("Your transactions is $transactions")
        balance = transactions.sum()
        println("Your Balance is = $balance")
    }
}

*/
