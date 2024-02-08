fun main() {

    val empleado1 = EmpleadoFIjo("Pepe", 1000.0, 4.0)
    val empleado2 = EmpleadoFIjo("Jose", 1500.0, 6.0)
    val empleado3 = EmpleadoPorHora("Antonio", 1400.0, 8.0)

    val departamento = Departamento()

    departamento.agregarEmpleado(empleado1)
    departamento.agregarEmpleado(empleado2)
    departamento.agregarEmpleado(empleado3)

    departamento.getEmpleados().forEach{ println(it)}

}