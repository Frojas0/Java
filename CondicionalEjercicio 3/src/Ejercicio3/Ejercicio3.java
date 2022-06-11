//Sistema de Calificaciones

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.println("Digite un numero entre 0 y 10");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion <= 9){
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion <= 8){
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion <= 7){
            System.out.println("D");
        } else if (calificacion >= 5 && calificacion <= 6){
            System.out.println("E");
        } else if (calificacion >= 0 && calificacion <= 5){
            System.out.println("F");
        } else {
            System.out.println("Fuera de Rango");
        }
        */
        System.out.println("Digite una calificacion");
        var calificacion = Integer.parseInt(entrada.nextLine());
        
        switch (calificacion){
            case 10, 9:
                System.out.println("A");
                break;
            case 8, 7:
                System.out.println("B");
                break;
            case 6, 5:
                System.out.println("C");
                break;
            case 4,3,2,0:
                System.out.println("F");
                break;
            default:
                System.out.println("Fuera de Rango");    
        }
    }
}
