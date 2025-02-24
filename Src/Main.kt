
fun main() {
    val articulo1 = Articulo("Mochila", 25.0)
    val articulo2 = Articulo("Reloj", 45.0)
    val ordenador1 = Ordenador("PC Gamer", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Laptop Básico", 399.99)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    println("Antes de la promoción:")
    articulos.forEach { println(it) }

    articulos.forEach { it.promocionNavidad(20.0) }

    println("\nDespués de la promoción:")
    articulos.forEach { println(it) }
}
