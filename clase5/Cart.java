package clase5;

public class Cart {

    public static int[] add(int[] cart, int newId) {

        int[] newCart = new int[cart.length + 1];
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        newCart[newCart.length - 1] = newId;

        return newCart;
    }

    static void showCart(int[] cart) {
        for (int article : cart) {
            System.out.println("id: " + article);
        }
    }
}
