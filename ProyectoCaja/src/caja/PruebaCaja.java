package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        //Variables locales
        int medAncho = 2;
        int medAlto = 3;
        int medProf = 2;

        //Crear objetos
        Caja caja1 = new Caja(); //Instancio con constructor vacio
        Caja caja2 = new Caja(3,3,3);
        //Asignacion de valores
        caja1.ancho = medAncho;
        caja1.alto = medAlto;
        caja1.profundidad = medProf;

        //Calculo llamando al metodo
        int resultado = caja1.calcularVolumen();
        System.out.println("resultado1 del volumen = " + resultado);
        //llamo al metodo directamente desde el print
        System.out.println("resultado2 del volumen = " + caja2.calcularVolumen());
    }
}
