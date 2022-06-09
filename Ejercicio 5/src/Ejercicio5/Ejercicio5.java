//Suma de tres calificaciones

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float cal1, cal2, cal3, total;
        
        System.out.println("Calculadora de calificaciones.");
        System.out.println("Ingrese la primer calificacion: ");
        cal1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la segunda calificacion: ");
        cal2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la tercer calificacion: ");
        cal3 = Float.parseFloat(entrada.nextLine());
        total = cal1 + cal2 + cal3;
        System.out.println("\nLa suma de las calificaciones es: " + total);     
    } 
}
