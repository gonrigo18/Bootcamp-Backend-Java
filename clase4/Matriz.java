package clase4;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[][] sales = new int[7][1];
        for (int day = 0; day < 7; day++) {
            for (int quantity = 0; quantity<1; quantity++){
                System.out.println("Ingrese las ventas del dia " + (day+1));
                sales[day][quantity] = keyboard.nextInt();
            }
        }
        keyboard.close();

        System.out.println("Informando...");
        for (int day = 0; day < 7; day++) {
            for (int quantity = 0; quantity<1; quantity++){
                System.out.println(sales[day][quantity]);
            }
        }

    }
}
