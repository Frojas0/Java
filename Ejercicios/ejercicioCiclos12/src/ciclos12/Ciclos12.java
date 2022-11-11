/*
Ejercicio 12:
Pedir un numero y calcular su factorial, realizarlo con las clases: Scanner y JOptionPane.
 */
package ciclos12;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        int num, fact = 1;

        //Realizado con la clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero para calcular su factorial: ");
        num = entrada.nextInt();

        for (int i = 1; i < num+1; i ++){
            fact *= i;
        }
        System.out.println("Factorial de "+ num +": "+ fact);
         */

        //Realizado con la clase JOptionPane
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para calcular su factorial: "));
        for (int i = 1; i < num+1; i ++){
            fact *= i;
        }
        JOptionPane.showMessageDialog(null, "Factorial de "+ num +": "+ fact);
    }
}
