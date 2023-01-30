package clase5;


class Test {

    int x=1; // línea 1
    int y=2; // línea 2

}

public class Ejemplo {
    public static void main(String args[ ]){

        Test t=new Test(1,2); // línea 3

        System.out.println(t.x+t.y); // línea 4

    }
}
