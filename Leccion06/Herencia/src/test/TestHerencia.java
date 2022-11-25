package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Facundo", 15032);
        System.out.println(empleado1);

        java.util.Date fechaRegistro = new Date(); //Creacion de Date
        
        Cliente cliente1 = new Cliente(fechaRegistro, "Toallin", true, 'F', 22, "Ushuaia");
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente(fechaRegistro, "Heraldo", true, 'M', 455, "La Grieta");
        System.out.println(cliente2);

    }
}
