fun main() {
    print("Introduzca el año: ")
    val a:Int? = readLine()?.toInt()

    val entre4:Boolean = a?.rem(4) == 0
    val entre100:Boolean = a?.rem(100) == 0
    val entre400:Boolean = a?.rem(400) == 0

    val bisiesto = entre4 || entre100 && entre400

    print(bisiesto)
}