package Ej4LibroYAutor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Tema tema = new Tema("Acción");
        Tema tema2 = new Tema("Drama");
        Autor autor = new Autor("Juan", LocalDate.of(1927, 3, 6));
        Autor autor2 = new Autor("Ana", LocalDate.of(2002, 3, 28));
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        temas.add(tema2);
        Libro libro = new Libro("Ahogado", autor, 220, temas);
        System.out.println(libro);
    }
}
