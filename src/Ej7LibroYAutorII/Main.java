package Ej7LibroYAutorII;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear objetos básicos
        Autor autor = new Autor("J.K. Rowling", 1001);
        Tema tema = new Tema("Fantasía", 2001);
        Editorial editorial = new Editorial("Bloomsbury", 3001);

        Libro libro = new Libro("Harry Potter y la Piedra Filosofal", 9780747532699L, autor, tema, editorial);

        Ejemplar ejemplar1 = new Ejemplar(1, libro);
        Ejemplar ejemplar2 = new Ejemplar(2, libro);

        Lector lector = new Lector("Juan Pérez", "12345678A");

        Date fechaPrestamo = new Date();

        Prestamo prestamo = new Prestamo(fechaPrestamo, lector, ejemplar1);

        Date fechaDevolucion = new Date(fechaPrestamo.getTime() + (7L * 24 * 60 * 60 * 1000));
        Historico historico = new Historico(fechaPrestamo, fechaDevolucion, lector, ejemplar1);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n--- Información del Libro y su Ejemplar ---");
        System.out.println(libro);
        System.out.println(ejemplar1);
        System.out.println(ejemplar2);

        System.out.println("\n--- Información del Lector ---");
        System.out.println(lector);

        System.out.println("\n--- Prestamo ---");
        System.out.println(prestamo);
        System.out.println("Fecha del préstamo: " + sdf.format(prestamo.getData_p()));

        System.out.println("\n--- Histórico ---");
        System.out.println(historico);
        System.out.println("Fecha del préstamo: " + sdf.format(historico.getData_p()));
        System.out.println("Fecha de devolución: " + sdf.format(historico.getData_t()));
    }
}
