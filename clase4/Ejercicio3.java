package clase4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de elementos: ");
        Scanner keyboard = new Scanner(System.in);
        int quantity = keyboard.nextInt();
        if (quantity > 0) {
            int[] days = new int[quantity];
            for (int i = 0; i < quantity; i++) {
                System.out.println("Ingrese un elemento: " + i);
                days[i] = keyboard.nextInt();
            }
            System.out.println("Carga finalizada");
            int mayor;
            int pMayor;
            int menor;
            int pMenor;
            mayor = days[0];
            pMayor=0;
            menor = days[0];
            pMenor=0;
            for (int i = 1; i < days.length; i++) {
                if (days[i] > mayor) {
                    mayor = days[i];
                    pMayor=i;
                }
                if (days[i] < menor) {
                    menor = days[i];
                    pMenor=i;
                }
            }
            System.out.println("Buscamos el mayor...");
            System.out.println("El mayor es: " + mayor + " en la posicion " + pMayor);
            System.out.println("Buscamos el menor...");
            System.out.println("El menor es: " + menor + " en la posicion " + pMenor);
        } else {
            System.out.println("Cantidad invalida");
        }
        keyboard.close();
    }
}

