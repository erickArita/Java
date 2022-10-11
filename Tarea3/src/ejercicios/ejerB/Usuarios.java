package ejercicios.ejerB;

import java.util.Scanner;

public class Usuarios {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de usuarios que ingresará:");
        int cantidadUsuarios = leer.nextInt();
        Usuario[] usuarios = new Usuario[cantidadUsuarios];

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario();
            System.out.println("Ingrese el nombre del usuario:" + (i + 1));
            usuarios[i].setNombre(leer.next());
            System.out.println("Ingrese la edad del usuario:");
            usuarios[i].setEdad(leer.nextInt());
            System.out.println("Ingrese el genero del usuario (M = Masculino, F = Femenino):");

            usuarios[i].setGenero(leer.next().toUpperCase().charAt(0));
        }

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario: " + (i + 1));
            System.out.println("\t - Nombre: " + usuarios[i].getNombre());
            System.out.println("\t - Edad: " + usuarios[i].getEdad());
            System.out.println("\t - Genero: " + usuarios[i].getGenero());
        }
    }
}
