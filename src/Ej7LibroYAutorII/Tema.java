package Ej7LibroYAutorII;

public class Tema {
    private String nombre;
    private int cod_t;

    public Tema(String nombre, int cod_t) {
        this.nombre = nombre;
        this.cod_t = cod_t;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod_t() {
        return cod_t;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombre='" + nombre + '\'' +
                ", cod_t=" + cod_t +
                '}';
    }
}
