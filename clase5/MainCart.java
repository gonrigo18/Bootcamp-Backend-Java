package clase5;

import java.util.Scanner;

public class MainCart {
    public static void main(String[] args) {
        Object[][] cart = new Object[0][1];

        Scanner keyboard = new Scanner(System.in);

        boolean continuar;

        do {
            System.out.println("Ingrese el ID del articulo");
            int articleId = keyboard.nextInt();
            String name = keyboard.next();
            cart = Cart.add(cart, articleId, name);
            Cart.showCart(cart);

            continuar = continuar(keyboard);
        }
        while (continuar);
        System.out.println("Ingrese id a eliminar");
        int id = keyboard.nextInt();
        if (Cart.exist(cart, id)) {
            cart = Cart.delete(cart, id);
        }
        else {
            System.out.println("No existe el articulo");
        }
        Cart.showCart(cart);


        keyboard.close();

    }

    static boolean continuar(Scanner keyboard) {
        System.out.println("Desea continuar? S/N");

        return keyboard.next().equalsIgnoreCase("S");
    }
}
