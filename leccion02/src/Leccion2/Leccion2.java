
package Leccion2;

import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        
        //Ejercicios con estructura if else
        /*
        var condicion = false;
        if(condicion){
            System.out.println("Condicion Verdadera"); //Condicional simple
        } else{
            System.out.println("Condicion Falsa"); //Condicional doble    
        }
        
        var numero =10;
        var numeroTexto = "Numero desconocido";
        if(numero ==1){
            numeroTexto = "numero uno";
        } else if(numero == 2){
            numeroTexto = "Numero dos";
        } else if(numero == 3){
            numeroTexto = "Numero tres";
        } else if (numero == 4){
            numeroTexto = "Numero cuatro";
        } 
        else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        */
        
        //Sentencia de control Switch
        
        Scanner entrada = new Scanner(System.in);
        
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
}
