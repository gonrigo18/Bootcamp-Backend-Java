package clase5;

import java.util.Scanner;

public class MainCart {
    public static void main(String[] args) {
        int[] cart = new int [0];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el ID del articulo");
        int articleId = keyboard.nextInt();

        cart = Cart.add(cart, articleId);

        Cart.showCart(cart);

        System.out.println("Ingrese el ID del articulo");
        articleId = keyboard.nextInt();
        cart = Cart.add(cart, articleId);

        Cart.showCart(cart);

        keyboard.close();

    }
}
