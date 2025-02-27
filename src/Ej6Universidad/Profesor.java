package Ej6Universidad;

public class Profesor {
    private String nombre;
    private int id;

    public Profesor(String nombre, int id) {
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
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
