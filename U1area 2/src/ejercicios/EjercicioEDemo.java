package ejercicios;

import java.util.Scanner;

public class EjercicioEDemo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        float a = leer.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        float b = leer.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        float c = leer.nextFloat();
        System.out.println("Ingrese el valor de d: ");
        float d = leer.nextFloat();
        System.out.println("Ingrese el valor de e: ");
        float e = leer.nextFloat();
        System.out.println("Ingrese el valor de f: ");
        float f = leer.nextFloat();
        System.out.println("Ingrese el valor de g: ");
        float g = leer.nextFloat();
        System.out.println("Ingrese el valor de h: ");
        float h = leer.nextFloat();
        System.out.println("Ingrese el valor de j: ");
        float j = leer.nextFloat();



        float resultado = a * a / (b - c) + (d - e) / (f - g * h / j);

        System.out.println("El resultado es: " + resultado);
    }
}
