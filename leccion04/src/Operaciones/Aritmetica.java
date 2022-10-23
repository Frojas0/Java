package Operaciones;

//los nombres de las clases se escriben en PascalCase
public class Aritmetica {

    //Los nombres de los atributos y metodos se escriben en cammelCase
    //Atributos de la clase
    int a;
    int b;

    //El constructor es un metodo especial (construye un objeto, reserva memoria, inicializa los atributos)
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando el constructor numero 1");
    }
    //Sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a; //variables locales
        this.b = b; //memoria stack
        System.out.println("Se esta ejecutando el constructor numero 2");
    }
    //Metodo
    //El modificador de acceso "public" indica que es de acceso publico, "void" significa que no devolvera nada
    public void sumarNumeros() {

        //lo que esta escrito dentro del metodo se conoce como cuerpo de la clase, y las variables dentro de este
        //se llaman variables locales que son creadas y destruidas cuando se termina de ejecutar
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    //Metodo
    public int sumarConRetorno(){
        return a +b;
    }

    //Metodo
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //El argumento a se asigna al atributo this.a
        this.b = arg2; //El uso de el operador this. es opcional
        //return a + b;
        return this.sumarConRetorno(); //Llamamos a un metodo con otro metodo
    }

}
