package clase4;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {

        // dado el vector int[] vector = {10, 20, 30, 40, 50} obtener otro vector con los valores invertidos

        int[] vector = {10, 20, 30, 40, 50};
        int [] aux = new int[vector.length];
        for (int i = vector.length-1; i >= 0 ; i--){
            aux[i] = vector[i];
        }
        System.out.println(Arrays.toString(aux));
    }
}
