package Ej6Universidad;

import java.util.Date;

public class Adscripcion {
    private Profesor profesor;
    private Catedra catedra;
    private Date data;

    public Adscripcion(Profesor profesor, Catedra catedra, Date data) {
        this.profesor = profesor;
        this.catedra = catedra;
        this.data = data;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Adscripcion{" +
                "profesor=" + profesor +
                ", catedra=" + catedra +
                ", data=" + data +
                '}';
    }
}
