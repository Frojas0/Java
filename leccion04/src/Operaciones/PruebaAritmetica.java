package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();  //Creacion de un objeto "aritmetica1"
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros(); //Llamo al metodo
        
        int resultado = aritmetica1.sumarConRetorno(); //Llamo al metodo
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(15,26);
        System.out.println("resultado de la suma con argumentos = " + resultado);
    }
}
