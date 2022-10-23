/*
Ejercicio 1-:
Pedir 10 numeros y escribir la suma total
 */
package ciclos10;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos10 {
    public static void main(String[] args) {
        //Variables
        int num, cont = 0, sum = 0;

        //Realizado con la clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);

        while (cont < 10){//Solicitud de 10 numeros
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            sum = sum + num; //Suma de numeros digitados
            cont++;
        }
        System.out.println("La suma total de los numeros digitados es: " + sum);
         */

        //Realizado con la clase JoptionPane

        while (cont < 10){//Solicitud de 10 numeros
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
            sum = sum + num; //Suma de numeros digitados
            cont++;
        }
        JOptionPane.showMessageDialog(null, "La suma total de los numeros digitados es: " + sum);
    }
}
