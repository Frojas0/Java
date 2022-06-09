//Pago concesionario de autos

package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int salario = 1000;
        int comision,cantAuto;
        float valorAuto,porcAuto, porAutoTotal, salarioTotal;
        comision = 150;
        porAutoTotal=0;
        System.out.println("Cuantos autos vendio este mes?");
        cantAuto = Integer.parseInt(entrada.nextLine());
        
        for(int i = 0; // índice de control
        i < cantAuto;  // condición booleana
        i++)           // modificación del índice tras cada bucle
    {
        System.out.println("Ingrese el valor del auto " + i + ":");
        valorAuto = Float.parseFloat(entrada.nextLine()); 
        porcAuto = (float) (valorAuto * 0.05); //Calculo el 5% de comision por auto
        porAutoTotal = porAutoTotal + porcAuto; //Acumulo la comision del valor del auto a pagar
    }
        salarioTotal = salario + porAutoTotal + (comision*cantAuto);
        System.out.println("\nVendio: " + cantAuto + " autos");
        System.out.println("El salario mensual a pagar es de: $" + salarioTotal);
    }
}
