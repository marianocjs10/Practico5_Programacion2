public class EmpleadoAComision extends Empleado{
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }
    @Override
    public double getSalario() {
        double salario=this.cantClientesCaptados * this.montoPorCliente;
        if(salario<this.salarioMinimo){
            salario=this.salarioMinimo;
        }
        return salario;
    }
    public int getCantClientesCaptados(){
        return this.cantClientesCaptados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
