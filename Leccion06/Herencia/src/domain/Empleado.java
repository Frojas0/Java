package domain;

public class Empleado extends Persona{
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //Para el incremento

    //Constructores
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado; //Incremento para un id unico por empleado
    }

    //Metodos Getter and Setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodo toString con StringBuilder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}