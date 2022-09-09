/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.
             utilizando JOptionPane
*/
package ciclos;

import javax.swing.*;

public class ejercicio01 {
    public static void main(String[] args) {
        int n, cuad;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(n >= 0){
            cuad = (int)Math.pow(n, 2);
            System.out.println("Numero: "+n+", elevado al cuadrado es: "+cuad);
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("Programa Finalizado");
    }
}
