fun main() {
    val cart=Cart()
    val mainDash =Meal("kebab",120)
    val salad =Meal("salad",50)
    val drink =Meal("lemon",20)
    cart.addItem(mainDash)
    cart.addItem(salad)
    cart.addItem(drink)
    println(mainDash.printMeal())

    //TODO: pay the money before submit the order

    val payment:Payment=PaypalPayment();

    val totalPrice=calcTotalPrice(cart)
  val isPaymentSuccess= payment.processPayment(totalPrice)
    if(isPaymentSuccess){
    // if money paid Success
    }else{
        println("Payment failed , try again later")
    }

}

class Meal(var name: String, var price: Int){
    fun printMeal(){
        println("$name, $price")
    }
}
//////
class Cart{
    private var mealsInCart:MutableList<Meal> = mutableListOf()

    fun addItem(meal:Meal){
        mealsInCart.add(meal)
    }

    fun clearAllItem(meal:Meal){
        mealsInCart.clear()
    }
    fun getAllItems():List<Meal>{
        return mealsInCart
    }
}
///////////
fun calcTotalPrice(cart:Cart): Int{
    var totalPrice=0
    cart.getAllItems().forEach { item ->
        totalPrice+=item.price
    }
    return totalPrice
}

interface Payment {
    fun processPayment(price: Int): Boolean
}

class CreditCardPayment:Payment {
    override fun processPayment(price: Int): Boolean {
        println("paying $price$ using Credit Card")
        return true
    }
}

class PaypalPayment:Payment {
    override fun processPayment(price: Int): Boolean {
        println("paying $price$ using Paypal")
        return true
    }
}
