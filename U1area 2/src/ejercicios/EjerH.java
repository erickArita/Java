package ejercicios;

import java.util.Scanner;

public class EjerH {
    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla que desea ver");
        int x = leer.nextInt();

        System.out.println("Ingrese cuantos mutiplos del numero anterior quiere ver");
        int y = leer.nextInt();
        int i = 1;
        while (i <= y) {
            System.out.println(x + " * " + " " + i + " = " + (x * i));

            i++;
        }

    }
}
