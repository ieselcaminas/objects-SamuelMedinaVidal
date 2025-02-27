package Ej4LibroYAutor;

public class Tema {
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
