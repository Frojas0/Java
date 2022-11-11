/*
Ejercicio 8: Pedir un numero N, y mostrar el intervalo de numeros [1;N]
 */
package Ciclos08;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos08 {
    public static void main(String[] args) {
        int inic = 1, n;

        //Realizado con la clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        n = entrada.nextInt();

        if (n <= 1){
            System.out.printf("Se esperaba un numero mayor a 1");
        }else{
            while (inic <= n) {
                System.out.println(+inic);
                inic++;
            }
        }
        */

        //Realizado con la clase JOptionPane

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));

        if (n <= 1){
            JOptionPane.showMessageDialog(null, "Se esperaba un numero mayor a 1...");
        }else{
            while (inic <= n) {
                JOptionPane.showMessageDialog(null, inic);
                inic++;
            }
        }

    }
}
