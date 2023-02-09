package ejercicios;

import java.util.Scanner;

//b. Desarrolle un programa en donde el usuario debe ingresar dos números y el
//        programa mostrará el resultado de la operación (a+b)*(a-b).
public class EjerB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("++++++++++++++ operación (a+b)*(a-b) +++++++++++++ ");

        System.out.println("Ingrese el primer  número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un número: ");
        int num2 = leer.nextInt();
        System.out.println("El resultado de la operación (a+b)*(a-b) es: " + ((num1 + num2) * (num1 - num2)));
    }
}
