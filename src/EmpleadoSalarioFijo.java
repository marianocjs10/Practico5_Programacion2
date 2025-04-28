public class EmpleadoSalarioFijo extends Empleado{
    private final double PORC1 = 0.05;
    private final double PORC2 = 0.1;
    private final int ANIO1 = 2;
    private final int ANIO2 = 5;
    private double sueldoBasico;


    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario(){
        return this.sueldoBasico + porcAdicional();
    }

    private double porcAdicional(){
        int antiguedad = antiguedadEnAnios();
        double porc;
        if(antiguedad > this.ANIO2){
            porc = this.PORC2;
        }else if(antiguedad >= this.ANIO1){
            porc = this.PORC1;
        }else{
            porc = 0;
        }
        return this.sueldoBasico*porc;
    }
}
