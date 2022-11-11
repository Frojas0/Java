/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.
 */
package ciclos06;

import javax.swing.*;
import java.util.Scanner;

public class ciclos06 {
    public static void main(String[] args) {
        int num, suma = 0;

        //Realizado con la clase scanner
        /*
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            suma += num;
        }while(num != 0);
        System.out.println("La suma de los numeros digitados es: "+suma);
        */

        //Realizado con JOptionPane
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += num;
        }while(num != 0);
        JOptionPane.showMessageDialog(null,"La suma de los numeros digitados es: "+suma);
    }
}
