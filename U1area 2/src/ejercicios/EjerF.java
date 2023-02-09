package ejercicios;


import java.util.Calendar;
import java.util.Scanner;


public class EjerF {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana del 1 al 7");
        int dia = leer.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Domigo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miercoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sabado");
        }
    }
}