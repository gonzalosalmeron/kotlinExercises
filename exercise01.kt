fun main() {
    val bocadilloJamon = 1.5
    val refresco = 1.05
    val cerveza = 0.75

    val numBocadillos = 5
    val numRefrescos = 3
    val numCervezas = 2

    val totalBocadillos = bocadilloJamon * numBocadillos
    val totalRefrescos = refresco * numRefrescos
    val totalCerveza = cerveza * numCervezas

    var total = totalBocadillos + totalRefrescos + totalCerveza;
    print("El total a pagar por ${numBocadillos} bocadillos, ${numRefrescos} refrescos y ")
    print("${numCervezas} cervezas es de ${totalBocadillos + totalRefrescos + totalCerveza}€")
}