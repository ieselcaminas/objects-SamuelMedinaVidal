package Ej7LibroYAutorII;

import java.util.Date;

public class Historico {
    private Date data_p;
    private Date data_t;
    private Lector lector;
    private Ejemplar ejemplar;

    public Historico(Date data_p, Date data_t, Lector lector, Ejemplar ejemplar) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }

    public Date getData_p() {
        return data_p;
    }

    public Date getData_t() {
        return data_t;
    }

    public Lector getLector() {
        return lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "data_p=" + data_p +
                ", data_t=" + data_t +
                ", lector=" + lector.getNombre() +
                ", ejemplar=" + ejemplar.getLibro().getNombre() + " (Ejemplar N°: " + ejemplar.getN_reg() + ")" +
                '}';
    }
}
