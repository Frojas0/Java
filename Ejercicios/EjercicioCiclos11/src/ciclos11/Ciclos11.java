/*
Ejercicio 11:
Diseñar un programa que muestre el producto de los 10 pimeros numeros impares, hacerlo con JOptionPane
 */
package ciclos11;

import javax.swing.*;

public class Ciclos11 {
    public static void main(String[] args) {
        // Variables locales
        int num, imp = 0;
        long prod = 1; //Variable del tipo long para admitir grandes numeros

        // Programa sin solicitud de numeros
        for (int i = 1; i <= 20; i += 2) { // Al iterador se le suman 2 por ciclo (1,3,5...)
            prod *= i;
        }
        // Programa con solicitud de numeros
        /*
        while(imp < 10){ // Se repite hasta que ingresen 10 numeros impares
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
            if (num % 2 != 0){ // Entra solo cuando se digita un numero impar
                prod *= num;
                imp++; // Contador de impares
            }
         */
        JOptionPane.showMessageDialog(null,"El producto de los 10 primeros numeros impares es: "+prod);
    }
}

