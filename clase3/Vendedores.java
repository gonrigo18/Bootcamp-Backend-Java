package clase3;

public class Vendedores {
    public static void main(String[] args) {

        String[] ventas = {
                "1|01/05/2022|2020|JUAN",
                "2|02/05/2022|12020|PEDRO",
                "3|03/05/2022|22020|PEDRO",
                "4|04/05/2022|32020|MARIA",
                "5|05/05/2022|42020|MARIA"
        };

        double monto = 0;
        int cantidad = 0;

        if (ventas.length > 0) {
            int i = 0;

            String ant = null, actual = null;

            while (i < ventas.length) {

                String[] registro = ventas[i].split("\\|");

                if (i == 0) {
                    ant = registro[3];
                    actual = registro[3];
                }
                while (ant.equals(actual)) {
                    monto += Double.parseDouble(registro[2]);
                    cantidad += 1;

                    i++;
                    if (i < ventas.length) {
                        registro = ventas[i].split("\\|");
                        actual = registro[3];
                    } else {
                        break;
                    }
                }
                System.out.println(ant + " vendio " + monto);
                System.out.println(ant + " cantidad de ventas " + cantidad);

                monto = Double.parseDouble(registro[2]);
                cantidad = 1;

                ant = actual;
            }
            System.out.println(actual + " vendio " + monto);
            System.out.println(actual + " cantidad de ventas " + cantidad);
        } else {
            System.out.println("No hay ventas");
        }


    }
}
