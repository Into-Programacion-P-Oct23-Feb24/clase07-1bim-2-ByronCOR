/*
salida
-1/1+1/2-1/3+1/4-1/5+1/6-1/7+1/8-1/9+1/10

explicación
1|-1/1
2|+1/2
3|-1/3
4|+1/4
5|-1/5
6|+1/6
7|-1/7
8|+1/8
9|-1/9
10|+1/10
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {

        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int contador = 0;
        int denominador = 3;
        String signo;
        String cadena = "";

        do {
            // para manejar el signo asociado 
            if (contador == 0) {
                signo = "-";
                contador = contador + 1;
            } else {
                signo = "+";
                contador = contador - 1;
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            denominador = denominador + 2;

        } while (denominador <= limite);

        System.out.printf("%d %s", contador, cadena);
    }
}
