fun main () {
    var a = 10
    var b = 9
    var c = a.rem(b)
    var d = (c+1)/2

    println("a. " + !((a > b) && (c == d))) // me ha salido igual
    println("b. " + ((a > b) && (c != d))) // me ha dado lo mismo
    println("c. ${!(a != (b + 1))}") // no me ha dado igual
    println("d. ${((a * b).rem(2) > ((c + 1) / 2))}") // me ha dado bien

}