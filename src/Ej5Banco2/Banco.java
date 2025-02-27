package Ej5Banco2;

public class Banco {
    private String entidad;

    public Banco(String entidad) {
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "entidad='" + entidad + '\'' +
                '}';
    }
}
