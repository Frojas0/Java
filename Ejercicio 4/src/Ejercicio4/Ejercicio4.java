//El mayor de dos numeros

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(entrada.nextLine());
        var mayor = (num1 > num2) ? "El primer numero es mayor" : "El segundo numero es mayor";
        System.out.println("mayor = " + mayor);
    }
}
