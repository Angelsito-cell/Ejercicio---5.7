class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String) :
    Vehiculo(marca, modelo, capacidadCombustible) {
    override fun calcularAutonomia(): Int = super.calcularAutonomia() + 100
}
