package Ej7LibroYAutorII;

import java.util.Date;

public class Prestamo {
    private Date data_p;
    private Lector lector;
    private Ejemplar ejemplar;

    public Prestamo(Date data_p, Lector lector, Ejemplar ejemplar) {
        this.data_p = data_p;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }

    public Date getData_p() {
        return data_p;
    }

    public Lector getLector() {
        return lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "data_p=" + data_p +
                ", lector=" + lector.getNombre() +
                ", ejemplar=" + ejemplar.getLibro().getNombre() + " (Ejemplar N°: " + ejemplar.getN_reg() + ")" +
                '}';
    }
}
