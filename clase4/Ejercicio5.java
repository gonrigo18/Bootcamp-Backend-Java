package clase4;

public class Ejercicio5 {
    public static void main(String[] args) {

        // dado el vector int[] vector = {10, 20, 30, 40, 50} invertir los valores invertidos

        int[] valores = {10, 15, 95, 100, 25};
        int aux;
        int max = valores.length / 2;
        for (int i = valores.length-1; i >=max; i--) {
            aux = valores[i];
            valores[i] = valores[valores.length-(i+1)];
            valores[valores.length - (i + 1)] = aux;
        }
        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
