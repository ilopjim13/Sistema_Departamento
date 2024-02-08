class Departamento () {

    private val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calcularSalarioTotal() {
        empleados.sumOf { it.calcularSalario() }
    }

    fun getEmpleados() : List<Empleado> = empleados

}