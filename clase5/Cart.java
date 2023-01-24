package clase5;

public class Cart {

    public static Object[] add(Object[][] cart, int newId, String name) {

        Object[][] newCart = new Object[cart.length + 1][1];
        for (int i = 0; i < cart.length; i++) {
            newCart[i][0] = cart[i][0];
            newCart[i][1] = cart[i][1];
        }
        newCart[newCart.length - 1][0] = newId;
        newCart[newCart.length - 1][1] = name;


        return newCart;
    }

    static void showCart(Object[][] cart) {
        for (Object[] article : cart) {
            System.out.println("id: " + article);
        }
    }
}
