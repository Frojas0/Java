//Paso por referencia
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(); //Instancio objeto
        persona1.nombre = "Fernanda";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1); //llamo al metodo
        System.out.println("persona1 nombre cambiado = " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("persona2 nombre = " + persona2.nombre);
    }
    //Metodos
    public static void cambiarValor(Persona persona){ //paso por referencia
        persona.nombre = "Maria";
    }

    public static Persona cambiarElValor(Persona persona){
        if (persona == null){ //Condicion para utilizar dos return
            System.out.println("valor de persona es invalido : Null");
            return null;
        } else{
            persona.nombre = "Monica";
            return persona;
        }
    }

}
