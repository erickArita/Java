package ejercicios;

import java.util.Scanner;

//a. Declare dos variables numéricas, solicite al usuario que ingrese los valores para
// las variables y muestre por salida del programa la suma, resta, multiplicación,
// división.

public class EjerA {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("++++++++++++++Operaciones matemáticas+++++++++++++ ");

        System.out.println("Ingrese el primer  número: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese un número: ");
        int num2 = leer.nextInt();

        suma(num1, num2);
        resta(num1, num2);
        multiplicar(num1, num2);
        dividir(num1, num2);
    }

    public static void suma(int num1, int num2) {
        System.out.print("La suma es: ");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void resta(int num1, int num2) {
        System.out.println("La resta es ");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplicar(int num1, int num2) {
        System.out.println("La multiplicación es ");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return;
        }
        System.out.println("La división es ");
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
