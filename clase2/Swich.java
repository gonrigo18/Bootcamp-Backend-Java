package clase2;

import java.util.Scanner;

public class Swich {

    /*Ingresa una opcion
    e indique que accion realizará
     */
    /*
    swich (key) {
            case value:
                break;
            default:
                break;
           }
        */


    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selecciona la operación a realizar: ");
        System.out.println("1 - Dar de alta nuevo codigo.");
        System.out.println("2 - Eliminar codigo existente.");
        System.out.println("3 - Consultar por el stock de un codigo.");
        System.out.println("4 - Salir");

        int option = keyboard.nextInt();
        String sku;

        if (0 < option && option < 5) {
            switch (option) {
                case 1:
                    System.out.println("Ingresa el codigo que quiere dar de alta: ");
                    sku = keyboard.next();
                    System.out.println("Dio de alta el codigo " + sku);
                    break;
                case 2:
                    System.out.println("Ingresa el codigo a eliminar: ");
                    sku = keyboard.next();
                    System.out.println("Elimino el codigo " + sku);
                    break;
                case 3:
                    System.out.println("Ingresa el codigo a verificar stock: ");
                    sku = keyboard.next();
                    System.out.println("El codigo " + sku + "tiene xxx stock.");
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestra aplicacion.");
                default:
                    break;
            }
        } else {
            System.out.println("La opcion ingresada no es valida");
        }
        keyboard.close();
    }
}
