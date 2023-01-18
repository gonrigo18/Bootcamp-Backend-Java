package clase1;

import java.util.Scanner;

public class Ejercicio {

    /**
     * Ingresar  edad
     * apellido, altura, peso, genero, sexo
     * ...
     */
    public static void main(String[] args) {

        int edad;
        String nombre;
        String apellido;
        float altura , peso;
        char genero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();

        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.next();

        System.out.println("Ingresa tu apellido: ");
        apellido = teclado.next();

        System.out.println("Ingresa tu altura: ");
        altura = teclado.nextFloat();

        System.out.println("Ingresa tu peso: ");
        peso = teclado.nextFloat();

        System.out.println("Ingresa tu genero: ");
        genero = teclado.next().charAt(0);


        System.out.println("Nombre: " + nombre + "\n" +
                            "Apellido: " + apellido + "\n" +
                            "Edad: " + edad + "\n" +
                            "Altura: " + altura + "\n" +
                            "Peso: " + peso + "\n" +
                            "Genero: " + genero
        );

        teclado.close();
    }
}
