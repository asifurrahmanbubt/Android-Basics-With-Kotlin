fun swap(){
    var a = 10
    var b = 20

    a = a + b
    b = a - b
    a = a - b
    println("after swap a=$a & b=$b")
}

fun main(){
    swap()
}