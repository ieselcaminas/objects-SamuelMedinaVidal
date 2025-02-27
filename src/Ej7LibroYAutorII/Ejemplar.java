package Ej7LibroYAutorII;

public class Ejemplar {
    private int n_reg;
    private Libro libro;

    public Ejemplar(int n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
    }

    public int getN_reg() {
        return n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "n_reg=" + n_reg +
                ", libro=" + libro.getNombre() + " (ISBN: " + libro.getIsbn() + ")" +
                '}';
    }
}
