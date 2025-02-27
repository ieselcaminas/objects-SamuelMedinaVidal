package Ej7LibroYAutorII;

public class Autor {
    private String nombre;
    private int cod_aut;

    public Autor(String nombre, int cod_aut) {
        this.nombre = nombre;
        this.cod_aut = cod_aut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod_aut() {
        return cod_aut;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", cod_aut=" + cod_aut +
                '}';
    }
}
