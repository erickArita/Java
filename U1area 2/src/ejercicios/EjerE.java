package ejercicios;

import java.util.Random;
import java.util.Scanner;

//
//e. Investigue el objeto Random de java y desarrolle un juego en el cual el usuario
//        debe adivinar un numero generado en un rango de 1 a 20 con un límite de tres
//        intentos, adicional a esto cuando termine el juego el programa le debe realizar
//        la pregunta al usuario si quiere seguir jugando para reiniciar el juego.
public class EjerE {
    public static void main(String[] args) {
        char continuar;
        Scanner leer = new Scanner(System.in);

        do {
            Random rnd = new Random();
            int dado = rnd.nextInt(20) + 1;

            for (int i = 0; i < 3; i++) {
                System.out.println("Adivine el numero de dado");
                int num = leer.nextInt();

                if (num == dado) {
                    System.out.println("Felicidade adivinó");
                    break;
                } else {
                    System.out.println("No adivinó");
                }
            }

            System.out.println("Precione enter para continuar");
            leer.nextLine();

            System.out.println("Se acabaron sus intentos, ingrese s para seguir");
            continuar = leer.nextLine().charAt(0);

            System.out.println("Precione enter para continuar");
            leer.nextLine();
        } while (continuar == 's');


    }
}
