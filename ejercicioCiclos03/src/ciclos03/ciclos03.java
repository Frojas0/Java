 /*
 Ejercicio 3: Leer numeros hasta que se introduzca un cero, para cada uno indicar si es par o impar.
 primero hacerlo con la clase scanner, luego con la clase JOptionpane
 */
package ciclos03;

 import javax.swing.*;
 import java.util.Scanner;

 public class ciclos03 {
    public static void main(String[] args) {

        // Realizado con utilidad Scanner

        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num = entrada.nextInt();

        while(num != 0){
            if(num %2 == 0){
                System.out.println("El numero: "+num+", es par");
            }else{
                System.out.println("El numero: "+num+", es impar");
            }
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
        }
        System.out.println("Numero ingresado 0; Fin del programa");
        */

        // Realizado con JOption

        int num;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(num %2 == 0){
                JOptionPane.showMessageDialog(null, "El numero: "+num+", es par");
            }else {
                JOptionPane.showMessageDialog(null, "El numero: " + num + ", es impar");
            }
        } while (num != 0);
        JOptionPane.showMessageDialog(null, "Numero 0 ingresado; Fin del programa");
    }
}

