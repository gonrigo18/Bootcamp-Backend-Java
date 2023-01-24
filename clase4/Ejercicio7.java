package clase4;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*dado un vector de 0 a 11
         informar la facturacion por trimestre. Para esto armar un vector de 4 posiciones, donde
         cada posicion tenga la facturacion de cada trimestre
        */

        double[] vector = {10, 12, 5445, 3413, 111, 354, 414, 1235, 1512, 126, 4657, 1231};
        double[] aux = new double[4];
        double trim1 =0; double trim2=0; double trim3=0; double trim4=0;
        int index = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i < 3) {
                trim1 = trim1 + vector[i];
                aux[index] = trim1;
            }
            if ( i >= 3 && i < 6){
                trim2 = trim2 + vector[i];
                aux[index+1] = trim2;
            }
            if( i >= 6 && i < 9){
                trim3 = trim3 + vector[i];
                aux[index+2] = trim3;
            }
            if (i >= 9){
                trim4 = trim4 + vector[i];
                aux[index+3] = trim4;
            }
        }
        for (double valor : aux) {
            System.out.println(valor);
        }
    }
}
