package ejercicios;

//Desarrolle un programa en el cual le pida una cantidad que el cliente lleva de un
//  producto, el precio y el programa devuelva la cantidad total a pagar incluyendo
//  el 15% de impuesto sobre venta.

import java.util.Scanner;

public class EjerC {
    public static void main(String[] args) {
        System.out.println("++++++++++++++ Cantidad total a pagar +++++++++++++ ");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = leer.nextInt();

        System.out.println("Ingrese el precio del producto: ");
        double precio = leer.nextDouble();

        double total = cantidad * precio;
        double impuesto = total * 0.15;

        System.out.println("El total a pagar es: " + (total + impuesto));
        System.out.println("El impuesto es: " + impuesto);

    }
}
