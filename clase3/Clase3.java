package clase3;

public class Clase3 {
    public static void main(String[] args) {
        /*
        for - cuando se la cantidad de veces a iterar
        while - cuando no se la cantidad maxima
        do while
         */


        /*
        leer 6 numeros entre 100
        cual es minimo
        maximo
        promedio
        pocision de minimo
        posicion de maximo
         */

        // vector de numeros
        int [] numeros = new int [100];

        for (int i = 0; i <100; i++){
            numeros[i] = i;
        }

        int [] elegidos = new int [6];
        int contador = 0;
        int minimo=0;
        int maximo=0;
        int minimos=0;
        int maximos=0;
        float promedio;
        int pMinimo=0;
        int pMaximo=0;
        int sumaNumeros=0;


        while (contador < 6){
            for(int i = 0; i < 6; i++){
                elegidos[i] = numeros[i];
                if ( i == 0 ) {
                    minimo = i;
                    pMinimo = i;
                    maximo = i;
                    pMaximo = i;
                }
                if(numeros[i] > maximo){
                    maximo = numeros[i];
                    pMaximo = i;
                    maximos+=maximo;
                }
                if (numeros[i] < minimo){
                    minimo = numeros[i];
                    pMinimo = i;
                    minimos+=minimo;
                }
            }
            contador++;
        }


    }
}
