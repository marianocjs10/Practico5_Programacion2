import java.time.LocalDate;

public class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public double getSalario(){
        return this.getSalario();
    }

    public String nombreCompleto(){
        return this.nombre +" "+ this.apellido;
    }

    public int antiguedadEnAnios(){
        return LocalDate.now().getYear() - this.anioIngreso;
    }

    @Override
    public String toString() {
        return "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", DNI: '" + DNI+"'.";
    }
}
