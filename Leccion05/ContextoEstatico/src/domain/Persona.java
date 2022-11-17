package domain;

import org.w3c.dom.ls.LSOutput;

public class Persona {
    //Atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; //No se utiliza el operador this en atributo estatico
        //Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    //Metodos Getter
    public int getIdPersona() { return this.idPersona;}
    public int getContadorPersona() { return this.contadorPersona;}
    public String getNombre() { return this.nombre;}

    //Metodos Setter
    public void setIdPersona(int idPersona) { this.idPersona = idPersona;}
    public void setContadorPersona(int contadorPersona) { this.contadorPersona = contadorPersona;}
    public void setNombre(String nombre) { this.nombre = nombre;}

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

