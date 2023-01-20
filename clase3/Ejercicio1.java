package clase3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Imprimir numeros del 1 al 10 uno abajo del otro
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            i += 1;
        }*/

        // Imprimir numeros del 1 al 10 salteando de a dos uno abajo del otro
        /*int i = 1;
        while ( i <=10){
            System.out.println(i);
            i = i+2;
        }*/

        //imprimir los numeros del 10 al 1 uno abajo del otro
        /*for (int i=10; i>=1; i--){
            System.out.println(i);
        }*/

        // imprimir los numeros del 1 al 10, sin imprimir 5 7 y 9
        /*for(int i = 1; i <=10; i++){
            if (i ==2 || i ==5|| i ==9){
                continue;
            }
            System.out.println(i);
        }*/

        // imprimir numeros del 1 al 30 sin imprimir los que se encuentran entre 10 y 20

        /*for(int i = 1; i <=30; i++) {
            if (i>=10 && i <=20){
                continue;
            }
            System.out.println(i);
        }*/

        // imprimi la suma de los numeros del 1 al 10
        /*int suma=0;
        for (int i = 1; i <=10; i++){
            suma= suma +i;
        }
        System.out.println(suma);*/

        // imprimi la suma de los numeros pares del 1 al 25

        /*int suma = 0;
        for (int i = 1; i <=25; i++){
            if (i % 2 != 0){
                continue;
            }
            suma = suma +i;
        }
        System.out.println(suma);*/

        // imprimir la multiplicacion de los numeros impares que se encuentren entre -10 y 10;

        /*int multi = 1;
        for (int i = -10; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            multi = multi * i;
        }
        System.out.println(multi);*/

        // implementar un codigo que imprima el mayor y el menor de una seerie de 5 numeros que vamos a intoducir

        int mayor = 0;
        int menor = 0;

        Scanner numero = new Scanner(System.in);

        for (int i = 0; i <5; i++){
            System.out.println("Ingresa un numero: ");
            int n = numero.nextInt();
            if (i == 0) {
                mayor = n;
                menor = n;
            }
            if (n > mayor){
                mayor = n;
            }
            if (n < menor){
                menor = n;
            }
        }
        System.out.println(mayor);
        System.out.println(menor);
    }

}
