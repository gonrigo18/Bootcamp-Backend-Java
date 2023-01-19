package clase2;

import java.util.Scanner;

public class Integrador {
    /*
    Ingresa opcion:
    1 - acumular
    2 - contar
    3 - promedio
     */

    public static void main(String[] args) {

        int acumular = 0;
        int contador = 0;
        int promedio = 0;
        int total = 0;
        int continuar = 0;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Ingresa una opcion: ");
            System.out.println("1 - acumular");
            System.out.println("2 - contar");
            System.out.println("3 - promedio");
            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingresa un valor acumular");
                    int valor = keyboard.nextInt();
                    acumular += valor;
                    break;
                case 2:
                    contador++;
                    break;
                case 3:
                    System.out.println("Ingrese 3 numeros para calcular promedio: ");
                    int valor1 = keyboard.nextInt();
                    int valor2 = keyboard.nextInt();
                    int valor3 = keyboard.nextInt();
                    promedio = (valor1 + valor2 + valor3) / 3;
                    total = (valor1 + valor2 + valor3);
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
            System.out.println("Desea continuar?: (1 - SI | 2 - NO)");
            continuar = keyboard.nextInt();
        } while (continuar == 1);
        System.out.println("Acumulado: " + acumular);
        System.out.println("Contador: " + contador);
        System.out.println("Total: " + total + " " + "Promedio: " + promedio);
        keyboard.close();
    }
}
