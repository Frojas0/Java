package test;

import domain.Persona;

public class PersonaPrueba {
    //Atributos
    private int contador;

    //Metodos
    public static void main(String[] args) {
        Persona persona1 = new Persona("Facundo");
        Persona persona2 = new Persona("Gerardo");
        Persona persona3 = new Persona("JuanCarlo");
        Persona persona4 = new Persona("Fernanda");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; No se puede referenciar desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

    public int getContador(){
        imprimir(new Persona("Josefina"));
        return this.contador;
    }
}
