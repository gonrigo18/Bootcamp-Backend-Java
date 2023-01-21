package clase4;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Dado el vector {    10,20,5,15,30,20}
        1 - informar el vector de la forma indice: X valor: Y,
        2 - totalizar el vector e informar el total,
        3 - informar el contenido de las posiciones impares
        4 - informar el mayor numero
        5 - informar cuantas veces aparece el numero 20 */

        int [] vector = {10, 20, 5 , 15 , 30 , 20};
        int total = 0;
        int mayor = 0;
        int cont = 0;

        for(int i = 0; i < vector.length; i++){
            System.out.println("Indice: " + i + " -> Valor: " + vector[i]);
            total = total + vector[i];
            if (vector[i] > mayor){
                mayor = vector[i];
            }
            if (vector[i] == 20){
                cont++;
            }

        }
        System.out.println("La suma total del contenido del vector es: " + total);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El numero 20 se repite: " + cont + " veces");





    }
}
