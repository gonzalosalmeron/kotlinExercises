fun main() {
    val a: Int? = null
    val b: Int? = 12


    println(a?.let{"El valor de la cadena es " + a})
    println(b?.let{"El valor de la cadena es " + b})

}