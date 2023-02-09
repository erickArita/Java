package ejercicios;

import java.util.Scanner;

public class EjerG {
    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la tabla que quiera ver");
        int num = leer.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}




