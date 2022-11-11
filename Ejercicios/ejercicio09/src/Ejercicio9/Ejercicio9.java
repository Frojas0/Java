//Descuento de almacen para compras +$100
package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantidad a pagar: ");
        var compra = Float.parseFloat(entrada.nextLine());
        
        if (compra > 100) {
            compra = compra * 0.8F;
        }
        System.out.println("El precio a pagar es: " + compra);
    }
}