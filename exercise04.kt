fun main(){
    val a = 0xAB
    val b = 3

    println("AB AND 03 = ${a and b}") // resultado = 3  / hexadecimal = 3
    println("AB OR 03 = ${a or b}") // resultado = 171  / hexadecimal = AB
    println("AB XOR 03 = ${a xor b}") // resultado = 168  / hexadecimal = A8
    println("desplazamiento de 2 bits de AB a la derecha = ${a shr 2}") // resultado = 42  / hexadecimal = A8
    println("desplazamiento de 2 bits de AB a la izquierda = ${a shl 2}") // resultado = 648  / hexadecimal = 288

}