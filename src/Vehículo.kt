open class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int) {
    open fun calcularAutonomia(): Int = capacidadCombustible * 10

    fun mostrarInformacion() {
        println("Vehículo: $marca $modelo - Autonomía: ${calcularAutonomia()} km")
    }
}
