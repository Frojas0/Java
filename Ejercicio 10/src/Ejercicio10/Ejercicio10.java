//Leer dos numeros, si = *, si 1 > 2 -, si 1 < 2 +
package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite dos numeros: ");
        var num1 = Float.parseFloat(entrada.nextLine());
        var num2 = Float.parseFloat(entrada.nextLine());
        float resultado = 0;
        
        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2){ 
            resultado = num1 - num2;
        } else if (num1 < num2){ 
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: " + resultado);
    }
}