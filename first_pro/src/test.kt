fun main () {
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
}


