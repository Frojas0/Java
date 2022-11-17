package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Facundo", 25000.0, false);

        //Modificar a traves de los metodos
        System.out.println("persona1 su nombre es: "+persona1.getNombre());//Obtencion de datos con atributo encapsulado 'private'
        persona1.setNombre("Juancarlo"); //Cambio de datos con atributo encapsulado 'private'
        System.out.println("persona1 su nombre modificado es: "+persona1.getNombre());
        System.out.println("persona1 su sueldo es: "+persona1.getSueldo());
        System.out.println("persona1, esta eliminado?: "+persona1.isEliminado());

        //Tarea: Crear otro objeto de tipo Persona, y asignar valores de manera inicial, imprimir, modificar y volver a imprimir
        //Creacion de objeto
        Persona persona2 = new Persona("Jorge", 75000.0, false);
        //Impresion por metodo Getter
        System.out.println("Datos de persona2:" +
                        "\n  Nombre: "+persona2.getNombre() +
                        "\n  Sueldo: "+persona2.getSueldo() +
                        "\n  Eliminado?: "+persona2.isEliminado());
        //Modificacion por metodo Setter
        persona2.setNombre("Gerardo");
        persona2.setSueldo(34000.5);
        persona2.setEliminado(true);
        //Impresion por metodo Getter
        System.out.println("Datos de persona2:" +
                "\n  Nombre: "+persona2.getNombre() +
                "\n  Sueldo: "+persona2.getSueldo() +
                "\n  Eliminado?: "+persona2.isEliminado());

        //Impresion de datos con el metodo toString
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);



    }
}
