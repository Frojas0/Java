/*
Ejercicio 5: Realizar un juego para adivinar un numero, para ello generar un numero aleatorio entre 0-100, y luego ir
pidiendo numeros indicando "es mayor" o "es menor" segun sea mayo o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos.
*/
package ciclos05;

import javax.swing.*;

public class ciclos05 {
    public static void main(String[] args) {

        int ran, num, cont = 0;
        JOptionPane.showMessageDialog(null,"Intente adivinar el numero Aleatoreo entre 0-100");
        ran = (int) (Math.random()*101); // math.random para dar un numero aleatoreo entre el rango dado
        System.out.println("N Aleatoreo = " + ran);

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Que numero es?"));
            if(ran == num){
                JOptionPane.showMessageDialog(null,"FELICIDADES!!! Es el numero: "+num);
            }
            if(ran > num){
                JOptionPane.showMessageDialog(null,"Su numero es menor que el Aleatoreo...");
            }
            if(ran < num){
                JOptionPane.showMessageDialog(null,"Su numero es mayor que el Aleatoreo...");
            }
            cont++;
        }while(ran != num);
        JOptionPane.showMessageDialog(null,"ADIVINO en: "+cont+" intentos; Fin del programa");
    }
}
