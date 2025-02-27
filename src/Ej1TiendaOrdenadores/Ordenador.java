package Ej1TiendaOrdenadores;

public class Ordenador {
    private String marca;
    private String modelo;
    private double precio;
    private String descripcion;
    private int unidades;

    public Ordenador(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Ordenador(String marca, String modelo, double precio, String descripcion, int unidades) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.unidades = unidades;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", unidades=" + unidades +
                '}';
    }
}
