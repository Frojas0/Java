//Cantidad de dolares

package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float cantG, cantL, cantJ, cantT;
        
        System.out.println("Cuantos dolares tiene Guillermo?: ");
        cantG = Float.parseFloat(entrada.nextLine());
        cantL = cantG/2;
        cantJ = (cantG+cantL)/2;
        cantT = cantG + cantL + cantJ;
        System.out.println("\nEntre los 3 tienen $" + cantT);
    }
}
