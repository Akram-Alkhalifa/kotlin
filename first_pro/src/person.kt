open class Person(private var name : String ,private var id : Int) {

    private var age : Int = 0
    fun getAge(): Int{
        return age
    }
    fun setAge(age: Int){
        if (age >= 1 && age <= 100) this.age = age else println("Error")
    }
    var email : String=""
        set(value) {
            field = "$value@a.com"
        }

    var address : String=""
        get() = "Aleppo"


   open fun prData(){
        println("$id  $name ")
    }
}