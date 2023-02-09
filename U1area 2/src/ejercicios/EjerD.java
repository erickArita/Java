package ejercicios;

import java.util.Scanner;

//Convierta en expresiones algorítmicas las siguientes expresiones algebraicas.
//        Coloque paréntesis solamente donde sean necesarios, a cada expresión el
//        usuario debe ingresarle sus valores desde el teclado.
public class EjerD {
    static Scanner leer = new Scanner(System.in);
    static float resultado;

    public static void main(String[] args) {
        char continuar;

        do {

            System.out.println("ingrese el ejercicio que quiere ejecutar desde a hasta k");
            char ejerSelected = leer.nextLine().charAt(0);
            System.out.println("Precione cualquier tecla para continuar");
            leer.nextLine();
            switch (ejerSelected) {
                case 'a' -> ejerA();
                case 'b' -> ejerB();
                case 'c' -> ejerC();
                case 'd' -> ejerD();
                case 'e' -> ejerE();
                case 'f' -> ejerF();
                case 'g' -> ejerG();
                case 'h' -> ejerH();
                case 'i' -> ejerI();
                case 'j' -> ejerJ();
                default -> System.out.println("No existe ese ejecicio");
            }

            System.out.print("El resultado es: ");
            System.out.println(resultado);
            System.out.println("Precione cualquier tecla para continuar");
            leer.nextLine();
            System.out.println("Ingrese s si desea continuar");
            continuar = leer.nextLine().toLowerCase().charAt(0);
        } while (continuar == 's');
    }

    public static void ejerA() {
        resultado = (3f / 2f) + (4f / 3f);
    }

    public static void ejerB() {
        System.out.println("Ingrese el valor de x: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el valor de y: ");
        int y = leer.nextInt();

        resultado = (1 / (x - 5f)) - ((3 * x * y) / 4f);
    }

    public static void ejerC() {
        resultado = 1 / 2f + 7;
    }

    public static void ejerD() {
        resultado = 7 + (1 / 2f);
    }

    public static void ejerE() {
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
        resultado = a * a / (b - c) + (d - e) / (f - g * h / j);
    }

    public static void ejerF() {
        System.out.println("Ingrese el valor de m: ");
        float m = leer.nextFloat();
        System.out.println("Ingrese el valor de n: ");
        float n = leer.nextFloat();
        System.out.println("Ingrese el valor de p: ");
        int p = leer.nextInt();

        resultado = (m / n) + p;

    }

    public static void ejerG() {
        System.out.println("Ingrese el valor de m: ");
        float m = leer.nextFloat();
        System.out.println("Ingrese el valor de n: ");
        float n = leer.nextFloat();
        System.out.println("Ingrese el valor de p: ");
        float p = leer.nextFloat();
        System.out.println("Ingrese el valor de q: ");
        float q = leer.nextFloat();

        resultado = m + (n / (p - q));
    }

    public static void ejerH() {
        System.out.println("Ingrese el valor de a: ");
        float a = leer.nextInt();
        System.out.println("Ingrese el valor de b: ");
        float b = leer.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        float c = leer.nextFloat();
        System.out.println("Ingrese el valor de d: ");
        float d = leer.nextFloat();

        resultado = a * a / (b * b) + c * c / (d * d);
    }

    public static void ejerI() {
        System.out.println("Ingrese el valor de m:");
        float m = leer.nextInt();
        System.out.println("Ingrese el valor de n: ");
        float n = leer.nextFloat();
        System.out.println("Ingrese el valor de p: ");
        float p = leer.nextFloat();
        System.out.println("Ingrese el valor de q: ");
        float q = leer.nextFloat();
        System.out.println("Ingrese el valor de r: ");
        float r = leer.nextFloat();
        System.out.println("Ingrese el valor de s: ");
        float s = leer.nextFloat();

        resultado = (m + n / p) / (q - r / s);
    }

    public static void ejerJ() {
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

        resultado = (3 * a + b) / (c - (d + 5 * e) / (f + g / (2 * h)));
    }

    public static void ejerK() {
        System.out.println("Ingrese el valor de a: ");
        float a = leer.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        float b = leer.nextFloat();
        System.out.println("Ingrese el valor de x: ");
        float x = leer.nextFloat();

        resultado = (a * a + 2 * a * b + b * b) / (1 / (x * x)) + 2;
    }
}
