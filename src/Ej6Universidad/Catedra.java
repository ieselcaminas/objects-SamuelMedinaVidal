package Ej6Universidad;

public class Catedra {
    private String nombre;
    private int id;
    private Departamento departamento;
    private Facultad facultad;

    public Catedra(String nombre, int id, Departamento departamento, Facultad facultad) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    @Override
    public String toString() {
        return "Catedra{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", departamento=" + departamento +
                ", facultad=" + facultad +
                '}';
    }
}
