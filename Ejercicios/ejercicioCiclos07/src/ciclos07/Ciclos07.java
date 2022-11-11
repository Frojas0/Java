/*
Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo y calcular la media.
 */
package ciclos07;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        int num, cont = 0, sum = 0;
        float media = 0;
        /*
        //Realizado con la clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite un numero: ");
        num = entrada.nextInt();
        while (num >= 0){ //Mientras el numero no sea negativo
            sum += num;
            cont++;
            System.out.printf("Digite un numero: ");
            num = entrada.nextInt();
            }
        if(cont == 0){ //Si no se ingreso ningun numero
            System.out.println("\nLa division entre cero no existe...");
        }else{
            media = sum/cont;
            System.out.println("El promedio de la suma de numeros ingresados es: "+media);
        }

        */
        //Realizado con la clase JOptionPane
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
        while (num >= 0){ //Mientras el numero no sea negativo
            sum += num;
            cont++;
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
            }
        if(cont == 0){ //Si no se ingreso ningun numero
            JOptionPane.showMessageDialog(null, "la division entre cero no existe");
        }else{
            media = sum/cont;
            JOptionPane.showMessageDialog(null, "Media de los numeros digitados: "+media);
        }
    }
}
