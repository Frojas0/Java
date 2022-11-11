/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo, el proceso se repetira hasta que se introduzca un cero.
*/
package ciclos;

import java.util.Scanner;

public class ciclos02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIgite un numero: ");
        int num = Integer.parseInt(entrada.nextLine());

        while(num != 0){
            if (num > 0){
                System.out.println("El numero: "+num+", Es positivo");
            } else{
                System.out.println("El numero: "+num+", Es negativo");
            }
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Numero ingresado = 0; Fin del programa");
    }
}
