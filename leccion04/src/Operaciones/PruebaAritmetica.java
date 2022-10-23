package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //variables locales
        int b = 7; //memoria stack
        miMetodo(); //LLamamos el nuevo metodo
        Aritmetica aritmetica1 = new Aritmetica();  //Creacion de un objeto "aritmetica1"
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros(); //Llamo al metodo

        // Para almacenar un objeto o los atributos se utiliza la memoria heap

        int resultado = aritmetica1.sumarConRetorno(); //Llamo al metodo
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(15,26);
        System.out.println("resultado de la suma con argumentos = " + resultado);

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);
    }

    public static void miMetodo() {
        //int a = 10; //Una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}
