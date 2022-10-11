package ejercicios.ejerA;

// Utilizando arreglos, ingresar y mostrar productos con sus respectivos precios,
// la cantidad de productos la debe definir el usuario.

import java.util.Scanner;

public class ProductoPrecio {

    static String[] productos;
    static double[] precios;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de productos que ingresará:");
        int cantidadProductos = leer.nextInt();

        productos = new String[cantidadProductos];
        precios = new double[cantidadProductos];

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el nombre del producto:");
            productos[i] = leer.next();
            System.out.println("Ingrese el precio del producto:");
            precios[i] = leer.nextDouble();
        }


        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + i + 1);
            System.out.println("\t - Nombre: " + productos[i]);
            System.out.println("\t - Precio: " + precios[i]);
        }
    }


}
