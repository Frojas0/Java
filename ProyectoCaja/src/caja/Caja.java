/*
Proyecto Caja: Ejercicio 1
Crear un proyecto segun las especificaciones mostradas a continuacion.
Formula: volumen = ancho * alto * profundidad
 */
package caja;

//Clase
public class Caja {
    //Atributos de la clase
    int alto;
    int ancho;
    int profundidad;

    //Constructor
    public Caja() {
        //Sobre carga de constructores
    }
    //Constructor con parametros
    public Caja(int alto, int ancho, int profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //Metodo
    public int calcularVolumen() {
        return alto * ancho * profundidad;
    }
}

