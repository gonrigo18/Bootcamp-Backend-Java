package clase4;

public class Clase4 {
    public static void main(String[] args) {
        // tamaño de un vector = vector.length
        int [] numeros = new int [100]; // defino un vector de 100
        for(int i = 0 ; i <100; i++){ // recorro el vector
            numeros[i] = i; // le asigno i a cada posicion del mismo
        }
        int cont = 6;
        int [] aux = new int[6]; // creo un vector auxiliar para guardar los 6 numeros elegidos
        while (cont > 0){
            int idx = (int)(Math.random() * (99 - 0) + 0); // creo la variable idx con un numero random entre 0-99
            aux[aux.length - cont] = numeros[idx]; // gaurdo el valor de la posicion elegida en el vector auxiliar
            cont--;
        }

        for (int valor : aux){ // imprimo los valos del vector auxiliar
            System.out.println(valor);
        }


    }
}
