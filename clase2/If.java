package clase2;

import java.util.Scanner;

public class If {

    /*
    Ingresar un valor por teclado y si es mayor a 18, informar que es adulto, de lo contrario no
     */

    public static void main(String[] args) {
        String adulto = "Es adulto";
        String menor = "No es adulto";
        int edad;
        System.out.println("Ingresa tu edad: ");
        Scanner teclado = new Scanner (System.in);
        edad = teclado.nextInt();

        // Con if
        if (edad >=18){
            System.out.println("Es adulto");
        }else{
            System.out.println("No es adulto");
        }

        // con ternario
        String resultado = edad >=18  ? adulto : menor ;
        System.out.println(resultado);

    }
}
