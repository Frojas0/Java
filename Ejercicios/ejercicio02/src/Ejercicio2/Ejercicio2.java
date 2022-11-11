//Salario semanal

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int horasSemanales, cantidadSemanas;
        float salarioHora, salarioTotal, salarioPorSemanas;
        
        System.out.println("Digite la cantidad de horas trabajadas por semana:");
        horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el salario a cobrar por hora:");
        salarioHora = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la cantidad de semanas trabajadas:");
        cantidadSemanas = Integer.parseInt(entrada.nextLine());
        salarioTotal = salarioHora * horasSemanales;
        System.out.println("El salario semanal es de: " + salarioTotal );
        salarioPorSemanas = cantidadSemanas * salarioTotal;
        System.out.println("EL salario por cantidad de semanas es de: " + salarioPorSemanas);
    }
}
