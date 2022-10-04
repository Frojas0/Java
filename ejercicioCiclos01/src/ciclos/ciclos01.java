/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.

*/
package ciclos;

import java.util.Scanner;

public class ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, cuad;
        System.out.println("Digite un numero entero: ");
        n = Integer.parseInt(entrada.nextLine());
        while(n >= 0){  // condicion
            cuad = (int)Math.pow(n, 2); // declaro un entero y lo elevo al cuadrado con Math.pow
            System.out.println("El numero: " +n+", elevado al cuadrado es: "+ cuad);
            System.out.println("Digite otro numero: ");
            n = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Se ingreso un numero negativo, Finalizando");

    }
}
