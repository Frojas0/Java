
import java.util.Scanner;

//Mi primer programa Hola Mundo
/*
Apertura y cierre de comentario para escribir
muchas lineas de comentarios
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*System.out.println("Hola Mundo desde Java");
        /??Variables P1
        Defino Variable como Entero
        int miVariable = 10;
        System.out.println(miVariable);
        //Reutilizo la variable
        miVariable = 5;
        System.out.println(miVariable);
        
        //Variable tipo String
        String miVariableCadena = "Bienvenidos" ;
        System.out.println(miVariableCadena);
        //Reutilizo la variable
        miVariableCadena = "Seguimos creciendo en programacion";
        System.out.println(miVariableCadena);
        //Palabra reservada var
        //apartir de JDK 10 interpreta la variable autimaticamente
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos Estudiando";
        //soutv + tab
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Reglas para definir una variable en Java
        //Variables se definen en formato camelCase
        //No se pueden utilizar numeros como primer caracter de nuestra variable
        //No puede tener caracteres especiales (exepto simbolo dolar $)
        //Si puede tener guion bajo y acento, pero no es recomendable
        //Ejercicio de Concatenacion
        
        var usuario = "Jorge";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio: Caracteres especiales con java
        var nombre = "Jacinto";
        System.out.println("Nueva Linea: \n" + nombre); //Salto de linea
        System.out.println("Tabulador: \t" + nombre); //Tabulador
        System.out.println("\t .:Menu:.");
        System.out.println("Retroceso: \b" + nombre); //Retroceso
        System.out.println("Comillas Simples: \'" + nombre + "\'"); //Comillas Simples
        System.out.println("Comillas Dobles:  \"" + nombre + "\""); //Comillas Dobles
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba su profesion: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
        */
        //Ejercicio clase Scanner
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Escriba su titulo: ");
        var titulo2 = entrada2.nextLine();
        System.out.println("Proporcione el autor: ");
        var autor2 = entrada2.nextLine();
        System.out.println(titulo2 + "  fue escrito por " + autor2);
        
    }
}
