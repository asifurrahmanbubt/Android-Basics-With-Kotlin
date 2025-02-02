fun birthdayGreetingV3() : String {
    val message1 = "Happy Birthday, Hafsa"
    val message2 = "You are now 28 years old!"
    return "$message1\n$message2"
}
fun main(){
    val message = birthdayGreetingV3()
    println(message)
    println(birthdayGreetingV3())
}