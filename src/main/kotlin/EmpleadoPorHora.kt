

class EmpleadoPorHora(nombre:String, var horasTrabajadas:Double, var tarifaPorHora:Double) :Empleado(nombre) {


    override fun calcularSalario() :Double {
        return this.horasTrabajadas * this.tarifaPorHora
    }

    fun prueba1() {
        println("soy porueba")
    }

}