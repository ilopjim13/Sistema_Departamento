class EmpleadoFIjo(nombre:String, var salarioFijo:Double, var numPagas:Double) :Empleado(nombre) {


    override fun calcularSalario() :Double {
        return this.salarioFijo * this.numPagas
    }

}