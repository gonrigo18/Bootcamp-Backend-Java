package clase4;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*Dado el vector  { 0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9} cada item del vector
        representa la inflacion de un mes
        1- informar inflacion anual
        2- informar la inflacion mas baja, junto con el numero del mes
        3- informar la inflacion mas alta, junto con el numero del mes
        4- informar el promedio de inflacion
        */

        double [] valores = { 0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9};
        double max=0;
        int mesMax=0;
        double min=0;
        int mesMin=0;
        double total=0;
        double promedio=0;

        for (int i = 0; i < valores.length; i++){
            total = total + valores[i];
            promedio = (total + valores[i])/12;

            if (i == 0){
                max = valores[i];
                min = valores[i];
            }
            if (valores[i] > max){
                max = valores[i];
                mesMax = i+1;
            }
            if (valores[i] < min){
                min = valores[i];
                mesMin = i+1;
            }

        }
        System.out.println("La inflacion anual fue de: " + total + "%");
        System.out.println("La inflacion mas alta fue de: " + max + " en el mes " + mesMax);
        System.out.println("La inflacion mas baja fue de: " + min + " en el mes " + mesMin);
        System.out.println("El promedio de la inflacion fue de: " + promedio );

    }
}
