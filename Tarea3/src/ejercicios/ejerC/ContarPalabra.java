package ejercicios.ejerC;

import java.util.Scanner;

// Crear un arreglo, que pida ingresar una palabra, para mostrarlo letra por letra y
// mostrar la suma de sus caracteres
public class ContarPalabra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese una palabra:");
        palabra = leer.next();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("Letra " + (i + 1) + ": " + palabra.charAt(i));
        }

        System.out.println(
                "La palabra " + palabra + " tiene " + palabra.length() + " caracteres"
        );

    }


}
