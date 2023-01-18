package clase1;

import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        System.out.println("Ingresaste el numero: " + teclado.nextInt());
    }
}
