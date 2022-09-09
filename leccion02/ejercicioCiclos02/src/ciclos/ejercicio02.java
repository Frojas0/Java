/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo, el proceso se repetira hasta que se introduzca un cero.
             hacerlo con JOptionPane
*/
package ciclos;

import javax.swing.*;

public class ejercicio02 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(num != 0){
            if (num > 0){
                JOptionPane.showMessageDialog(null , "El numero: "+num+", Es positivo");
            } else{
                JOptionPane.showMessageDialog(null , "El numero: "+num+", Es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null , "Numero 0 ingresado; FIn del programa");
    }
}