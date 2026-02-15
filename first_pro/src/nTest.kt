
fun main() {
   val u1:User=User("akram",26,true)
   val u2=User("naser",2,false)
    u1.printData()
    u2.printData()
}

class User(val name: String, val age: Int ,  val isAdmin: Boolean) {
   val email: String
       get() = "$name@gmail.org"
    fun printData() {
        println("Name: $name, Age: $age, Email: $email, isAdmin: $isAdmin")
    }
}