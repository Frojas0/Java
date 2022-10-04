/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido.
             lo hacemos primero con la clase scanner y luego lo hacemos con la clase JOptionPane
*/
package ciclos04;

import javax.swing.*;
import java.util.Scanner;

public class ciclos04 {
    public static void main(String[] args) {
        int num, cont = 0;

        // Realizado con la utilidad Scanner
        /*
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.printf("Digite un numero: ");
            num = entrada.nextInt();
            cont++;
        }while (num >= 0);
        System.out.printf("Cantidad de numeros ingresados: "+cont+ "\n Se introdujo un numero negativo; Fin del programa");
        */

        // Realizado con JOptionPane
        cont = -1; // inicializo en -1 para que no tenga en cuenta el negativo.
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            cont++;
        }while (num >=0);
        JOptionPane.showMessageDialog(null,"Cantidad de numeros ingresados: "+cont+
                "\n Se introdujo un numero negativo; Fin del programa" );

    }
}
