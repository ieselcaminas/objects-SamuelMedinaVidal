package Ej4LibroYAutor;

import java.time.LocalDate;

public class Autor {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Autor(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
