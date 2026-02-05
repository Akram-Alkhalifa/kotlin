fun main() {
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
  }
