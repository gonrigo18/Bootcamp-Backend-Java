package clase5;

public class Cart {

    public static Object[][] add(Object[][] cart, int newId, String name) {

        Object[][] newCart = new Object[cart.length + 1][2];
        for (int i = 0; i < cart.length; i++) {
            newCart[i][0] = cart[i][0];
            newCart[i][1] = cart[i][1];
        }
        newCart[newCart.length - 1][0] = newId;
        newCart[newCart.length - 1][1] = name;


        return newCart;
    }

    public static void showCart(Object[][] cart) {
        System.out.println("Mostrando el carrito: ");
        for (Object[] article : cart) {
            System.out.println("id: " + article[0] + " | Articulo: " + article[1]);
        }
    }

    public static Object[][] delete(Object[][] cart, int id) {
        Object [][] newCart = new Object[cart.length-1][2];
        int j = 0;
        for ( int i = 0; i < cart.length; i++){
            if ((Integer) cart[i][0] != id){
                newCart[j][0] = cart [i][0];
                newCart[j][1] = cart [i][1];
                j++;
            }
        }
        return newCart;
    }

    public static boolean exist (Object[][] cart, int id){
        int idx=-1;
        for (int i =0; idx==-1 && i < cart.length; i++){
            if ((Integer) cart[i][0] == id){
                idx = i;
            }
        }
        return idx !=-1;
    }



}
