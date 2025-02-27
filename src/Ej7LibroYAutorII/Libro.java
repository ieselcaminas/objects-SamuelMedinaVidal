package Ej7LibroYAutorII;

public class Libro {
    private String nombre;
    private Long isbn;
    private Autor autor;
    private Tema tema;
    private Editorial editorial;

    public Libro(String nombre, Long isbn, Autor autor, Tema tema, Editorial editorial) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.tema = tema;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Tema getTema() {
        return tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", isbn=" + isbn +
                ", autor=" + autor +
                ", tema=" + tema +
                ", editorial=" + editorial +
                '}';
    }
}
