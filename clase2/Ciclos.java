package clase2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ciclos {

    // Ingresar n
    // sumar los pares e impares n veces.

    public static void main(String[] args) {

        int pares = 0;
        int impares = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            boolean esPar = i % 2 == 0;
            if (esPar) {
                pares += i;
            } else {
                impares += i;
            }
        }
        System.out.println(pares);
        System.out.println(impares);
        teclado.close();
    }
}
