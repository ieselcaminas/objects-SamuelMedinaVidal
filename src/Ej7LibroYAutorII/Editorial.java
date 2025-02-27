package Ej7LibroYAutorII;

public class Editorial {
    private String nombre;
    private int cod_ed;

    public Editorial(String nombre, int cod_ed) {
        this.nombre = nombre;
        this.cod_ed = cod_ed;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", cod_ed=" + cod_ed +
                '}';
    }
}
