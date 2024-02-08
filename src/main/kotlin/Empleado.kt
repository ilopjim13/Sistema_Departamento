abstract class Empleado(val nombre:String) {

    val id = ++ident

    abstract fun calcularSalario() :Double

    companion object {
        var ident = 0
    }

    override fun toString(): String {
        return "$nombre con ID-${"%04d".format(id)} tiene un salario de ${"%.2f".format(calcularSalario())}€ al mes"
    }


}