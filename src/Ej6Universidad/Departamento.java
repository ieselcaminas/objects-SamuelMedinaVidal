package Ej6Universidad;

public class Departamento {
    private String nombre;
    private int id;
    private AreaConocimiento areaConocimiento;

    public Departamento(String nombre, int id, AreaConocimiento areaConocimiento) {
        this.nombre = nombre;
        this.id = id;
        this.areaConocimiento = areaConocimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", areaConocimiento=" + areaConocimiento +
                '}';
    }
}
