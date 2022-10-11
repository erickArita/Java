package ejercicios.ejerB;

public class Usuario {
    private String nombre;
    private int edad;
    private char genero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("La edad debe ser mayor a 0");
            return;
        }
        this.edad = edad;
    }

    public void setGenero(char genero) {
        if (genero == 'M' || genero == 'F') {
            this.genero = genero;
        } else {
            System.out.println("El genero debe ser M o F");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero == 'M' ? "Masculino" : "Femenino";
    }

}
