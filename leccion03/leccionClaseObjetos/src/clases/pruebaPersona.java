package clases;

public class pruebaPersona {
    public static void main(String[] args) {
        persona persona1 = new persona(); // Esto es una instancia, es el objeto que creamos de la clase para usar
                                          // las caracteristicas de la clase.
                                          // Creo la variable persona1 y la instancio, creando el objeto
        persona1.nombre = "Facundo";
        persona1.apellido = "Rojas";
        persona1.obtenerInformacion();

        persona persona2 = new persona(); //Creamos otro objeto
        System.out.println("persona2 =" + persona2); //Muestra de donde viene el objeto y la direccion de memoria establecida
        System.out.println("persona1 =" + persona1);
        persona2.obtenerInformacion(); // Objeto persona2 sin valores
        persona2.nombre = "Juan";
        persona2.apellido = "Cruz";
        persona2.obtenerInformacion(); //Objeto persona2 con valores
    }
}
