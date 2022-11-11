package Operaciones;

//Clase
public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //variables locales
        int b = 7; //memoria stack
        miMetodo(); //LLamamos el nuevo metodo
        Aritmetica aritmetica1 = new Aritmetica();  //Creacion de un objeto "aritmetica1"
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros(); //Llamo al metodo

        // Para almacenar un objeto o los atributos se utiliza la memoria heap

        int resultado = aritmetica1.sumarConRetorno(); //Llamo al metodo
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(15,26);
        System.out.println("resultado de la suma con argumentos = " + resultado);

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);

        //LLamamos al metodo creado en la clase secundaria
        Persona persona = new Persona("Cristian", "Martinez");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }
    //Modularidad, creamos un nuevo metodo
    public static void miMetodo() {
        //int a = 10; //Una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}

//Clase 2
/*Solo puede haber una clase de tipo publica, al crear otra clase automaticamente se le asigna el modificador de acceso
default o package, a esta clase solo se la puede acceder desde el mismo paquete
 */
class Persona{
    //Atributos de la clase
    //Atributos de la clase
    String nombre;
    String apellido;

    //Metodo
    Persona(String nombre, String apellido) { //Constructor
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
class Imprimir{
    public Imprimir(){
        super(); //el constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresion del objeto actual (this): "+this);
        }
    }
}
