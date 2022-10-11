package ejercicios.ejerD_E;

import java.util.Scanner;

public class SumaMatrices {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz1, matriz2, matriz3;


        System.out.println("Ingrese la dimension de la matriz");
        int dimencion = leer.nextInt();
        matriz1 = new int[dimencion][dimencion];
        matriz2 = new int[dimencion][dimencion];
        matriz3 = new int[dimencion][dimencion];

        System.out.println("Ingrese los valores de la matriz 1");
        llenarMatriz(matriz1);

        System.out.println("Ingrese los valores de la matriz 2");
        llenarMatriz(matriz2);

//        suma
        for (int i = 0; i < dimencion; i++) {
            for (int j = 0; j < dimencion; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

//        mostrar matrices
        System.out.println("Matriz 1");
        mostrarMatriz(matriz1);

        System.out.println("Matriz 2");
        mostrarMatriz(matriz2);

        System.out.println("Suma");
        mostrarMatriz(matriz3);


        sumaUltimaFila(matriz3);

    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%5s", matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    private static void sumaUltimaFila(int[][] matriz) {
        int suma = 0, ultimaFila = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[ultimaFila][i];
        }
        System.out.println("La suma es de la ultima fila es: " + suma);
    }
}
