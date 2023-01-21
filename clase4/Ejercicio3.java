package clase4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de elementos: ");
        Scanner keyboard = new Scanner(System.in);
        int quantity = keyboard.nextInt();
        int[] days = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Ingrese un elemento: " + i);
            days[i] = keyboard.nextInt();
        }
        System.out.println("Carga finalizada");
        System.out.println("Buscamos el mayor");
        int mayor;
        if (days.length > 0) {
            mayor = days[0];
            for (int i = 1; i < days.length; i++) {
                if (days[i] > mayor) {
                    mayor = days[i];
                }
            }
            System.out.println("El mayor es: " + mayor);
        } else {
            System.out.println("Vector vacio");
        }
        keyboard.close();
    }
}
