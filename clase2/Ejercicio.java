package clase2;

import java.util.Scanner;

public class Ejercicio {

    // Dado 3 numeros, informar el mayor
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros!");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int mayor;
        mayor = Mayor(num1,num2,num3);
        System.out.println("El numero mas grande es: " + mayor);
        teclado.close();
    }

    public static int Mayor(int a, int b, int c){
        if (a > b && a > c) {
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
