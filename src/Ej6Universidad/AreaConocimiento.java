package Ej6Universidad;

public class AreaConocimiento {
    private String nombre;
    private int id;

    public AreaConocimiento(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AreaConocimiento{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
