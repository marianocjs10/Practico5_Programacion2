public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAComision("33967836","Mariano", "Videla", 2010, 850000.00, 9, 100000.0);
        Empleado empleado2 = new EmpleadoAComision("32165498","Luis", "Sanchez", 2015, 850000.00, 10, 100000.0);
        Empleado empleado3 = new EmpleadoSalarioFijo("98765432","Juan", "Perez", 2020, 850000.00);
        Empleado empleado4 = new EmpleadoAComision("74185296","Jose", "Gomez", 2012, 850000.00, 15, 100000.0);
        Empresa empresa = new Empresa(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);
        empresa.mostrarSalario();
        System.out.println("El empleado con mas clientes captados es: "+empresa.empleadoConMasClientes());
    }
}
