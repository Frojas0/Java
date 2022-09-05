
package cicloWhile;

public class ejercicioWhile01 {
    public static void main(String[] args) {

        // Ciclo while
        var conteo = 0; //Inferencia de tipos
        while (conteo < 7) {
            System.out.println("conteo = " + conteo);
            conteo++; //Aumentamos en uno la variable
        }

        // Ciclo do-while

        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);

        // Ciclo for
        // for (iterador;condicion;paso)

        for (var i = 0; i <= 7; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break; // Termino el ciclo con break
            }
        }

        // Uso de las palabras break y continue junto a labels (etiquetas)

        inicio:
        for (var i = 0; i <= 7; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break inicio;
            }
        }

        for (var i = 0; i <= 7; i++) {
            if (i % 2 != 0) {
                continue; // Va a la siguiente iteracion con continue
            }
            System.out.println("i = " + i);
        }
    }
}
