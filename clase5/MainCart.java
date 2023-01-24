package clase5;

import java.util.Scanner;

public class MainCart {
    public static void main(String[] args) {
        int[] cart = new int[0];

        Scanner keyboard = new Scanner(System.in);

        boolean continuar;

        do {
            System.out.println("Ingrese el ID del articulo");
            int articleId = keyboard.nextInt();
            cart = Cart.add(cart, articleId);
            Cart.showCart(cart);

            continuar = continuar(keyboard);
        }
        while (continuar);
        keyboard.close();

    }

    static boolean continuar(Scanner keyboard) {
        System.out.println("Desea continuar? S/N");

        return keyboard.next().equalsIgnoreCase("S");
    }
}
