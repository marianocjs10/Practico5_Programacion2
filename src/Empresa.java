import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>empleados;

    public Empresa(Empleado empleado) {
        this.agregarEmpleado(empleado);
    }

    public void agregarEmpleado(Empleado empleado){
        if(this.empleados==null)this.empleados=new ArrayList<>();
        this.empleados.add(empleado);
    }
    public void mostrarSalario(){
        for(Empleado empleado : empleados){
            System.out.println("Nombre: " + empleado.nombreCompleto() + "\nSalario: $"+empleado.getSalario());
        }
    }
    public Empleado empleadoConMasClientes(){
        Empleado empleadoMayorCantidad = null;
        int mayorCantidad = 0;
        for(Empleado empleado : this.empleados){
            if(empleado instanceof EmpleadoAComision){
                if(((EmpleadoAComision) empleado).getCantClientesCaptados()>mayorCantidad){
                    mayorCantidad=((EmpleadoAComision) empleado).getCantClientesCaptados();
                    empleadoMayorCantidad=empleado;
                }
            }
        }
        return empleadoMayorCantidad;
    }


}
