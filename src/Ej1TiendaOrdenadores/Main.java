package Ej1TiendaOrdenadores;

public class Main {
    public static void main(String[] args) {
        Ordenador macBook = new Ordenador("Apple", "macBook air", 899.99);

        macBook.setDescripcion("MacBook Air, el portátil más ligero de Apple.");
        macBook.setUnidades(14);

        System.out.println(macBook);
    }
}
