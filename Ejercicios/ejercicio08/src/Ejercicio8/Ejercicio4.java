//Determinar si un alumno aprueba con 3 notas, prom > 70
package Ejercicio8;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite las 3 notas a promediar: ");
        var nota1 = Float.parseFloat(entrada.nextLine());
        var nota2 = Float.parseFloat(entrada.nextLine());
        var nota3 = Float.parseFloat(entrada.nextLine());
        var promedio = (nota1 + nota2 + nota3)/3;
        
        if (promedio >= 70) {
            System.out.println("El alumno esta aprobado con: " + promedio);
        } else {
            System.out.println("El alumno esta desaprobado con: " + promedio);
        } 
    }
}
