/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son
de 30 dias
 */
package Ciclos09;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        int dia, mes, anio;
        boolean error = false;

        /*
        //Realizado con la clase Scanner

        //Solicitud de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el dia: ");
        dia = entrada.nextInt();
        System.out.println("Digite el mes: ");
        mes = entrada.nextInt();
        System.out.println("Digite el año: ");
        anio = entrada.nextInt();

        System.out.println("Fecha introducida: "+dia+"/"+mes+"/"+anio);

        //Busqueda de error en fecha
        if (dia <= 0 | dia > 30){
            error = true;
        }else if (mes <= 0 | mes > 12){
            error = true;
        }else if (anio <= 0 | anio > 2022){
            error = true;
        }

        //Verificacion de fecha correcta/incorrecta
        if (error == true){
            System.out.println("La fecha introducida es INCORRECTA");
        }else{
            System.out.printf("La fecha introducida es CORRECTA");
        }
         */


        //Realizado con la JOptionPane

        //Solicitud de datos
        Scanner entrada = new Scanner(System.in);
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un año: "));

        JOptionPane.showMessageDialog(null, "Fecha introducida: "+dia+"/"+mes+"/"+anio);

        //Busqueda de error en fecha
        if (dia <= 0 | dia > 30){
            error = true;
        }else if (mes <= 0 | mes > 12){
            error = true;
        }else if (anio <= 0 | anio > 2022){
            error = true;
        }

        //Verificacion de fecha correcta/incorrecta
        if (error == true){
            JOptionPane.showMessageDialog(null, "La fecha introducida es INCORRECTA");
        }else{
            JOptionPane.showMessageDialog(null, "La fecha introducida es CORRECTA");
        }





    }
}
