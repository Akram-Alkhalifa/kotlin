fun main () {
    var p1:Person=Person("akram",5)
    p1.setAge(101)
    println(p1.getAge())
    p1.prData()
    p1.email="s"
    println(p1.email)
    println(p1.address)

    var s1:Stu=Stu(25,"ak")
    var s2 = s1.copy()
    println(s2.toString())

    var l =listOf(p1,s1)
    l.forEach{ println(it)}
}

data class Stu(var age:Int,var name:String){}