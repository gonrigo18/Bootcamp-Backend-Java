package clase2;

import java.util.Scanner;

public class Notas {
    /*
    Ingresar cantidad de notas 3
    calcular mayor
    calcular menor
    calcular promedio
     */
    public static void main(String[] args) {

        System.out.println("Ingresa la cantidad de notas");
        Scanner keyboard = new Scanner(System.in);
        int cantidad = keyboard.nextInt();

        double mayor = 0;
        double menor = 0;
        double total = 0;
        double promedio = 0.0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            int nota = keyboard.nextInt();
            total += nota;

            if (i == 0) {
                mayor = nota;
                menor = nota;
            }

            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        promedio = total / cantidad;
        System.out.println("Nota mayor =" + mayor);
        System.out.println("Nota menor = " + menor);
        System.out.println("Promedio = " + promedio);
        keyboard.close();
    }
}
