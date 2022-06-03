
import java.util.Scanner;

//Mi primer programa Hola Mundo
/*
Apertura y cierre de comentario para escribir
muchas lineas de comentarios
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*
        System.out.println("Hola Mundo desde Java");
        /Variables P1
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
        */
        
        //Reglas para definir una variable en Java
        //Variables se definen en formato camelCase
        //No se pueden utilizar numeros como primer caracter de nuestra variable
        //No puede tener caracteres especiales (exepto simbolo dolar $)
        //Si puede tener guion bajo y acento, pero no es recomendable
        
        /*
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
        
        //Ejercicio clase Scanner
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Escriba su titulo: ");
        var titulo2 = entrada2.nextLine();
        System.out.println("Proporcione el autor: ");
        var autor2 = entrada2.nextLine();
        System.out.println(titulo2 + "  fue escrito por " + autor2);
        */
        
        /*
        //Clase 4: 
        //Tipos primitivos Enteros
        //Tipo byte (8bit)
        byte numEnteroByte = 127; //(byte) Fuerza al programa a convertir el numero fuera de rango en el rango del byte
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("valor minimo del Byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);

        //Tipo short (16bit)
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);
        
        //Tipo integer (32bit)
        int numEnteroInt = 2147483647; 
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Integer: " + Integer.MAX_VALUE);
        
        //Tipo long (64bit)
        long numEnteroLong = 9223372036854775807L; //Por defecto java asigna datos numericos a int, debemos agregar L de long
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " +Long.MAX_VALUE);
        
        //Tipos primitivos Flotantes
        //Tipo float
        float numFloat = 3.4028235E38F; //Colocamos F al final de la literal para convertirlo a flotante
                                //por que java trasnforma los num con . directamente en double
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE);
        
        //Tipo double
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del float: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del float: " + Double.MAX_VALUE);
         */
        
        /*
        //CLASE 5
        //Inferencia de tipos var y tipos primitivos
        var numEntero = 20;//Por defecto las literales sin punto son de tipo int\
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Con el punto se trasnforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0; 
        System.out.println("numDouble = " + numDouble);
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        System.out.println("Asignamos char como variable");
        char varCaracter = '\u0024'; //Indicamos a java la asignacion con el codigo Unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Indicamos a java la asignacion con el codigo Decimal
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un Caracter especial
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        System.out.println("\n");
        System.out.println("Usamos var para que Java decida autmaticamente");    
        var varCaracter1 = '\u0024'; 
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = 36; //Java lo detecta como un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$'; //Muestra el valor decimal asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        */
        /*
        //CLASE 6
        //Tipos primitivos tipos booleanos
        boolean varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
             System.out.println("La bandera es roja");
        }
        
        //Algoritmo: Es mayor de edad?
        var edad = 15; //Literal tener presente la ingerencia de tipo
        //var adulto = edad >= 18;
        if (edad >=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        */
        /*
        //Conversion de tipos primitivos
        var edad = Integer.parseInt("20"); //Convierte la variable de tipo string a integer
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416"); //Convierte la variable de tipo string a double
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        */
         
        //Conversion de tipos primitivos en Java Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(3);
        System.out.println("fraseChar = " + fraseChar);
        
        var entrada = new Scanner(System.in);
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(1);
        System.out.println("fraseChar = " + fraseChar);
    }
}
