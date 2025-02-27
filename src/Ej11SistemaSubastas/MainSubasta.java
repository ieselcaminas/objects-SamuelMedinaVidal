package Ej11SistemaSubastas;

public class MainSubasta {
    public static void main (String[] args){
        Subasta subasta1 = new Subasta("Coches", "25-08-2024");
        Lote lote1 = new Lote("Lote 1", subasta1);
        Lote lote2 = new Lote("Lote 2", subasta1);
        Articulo articulo1 = new Articulo("Ford Focus",9342, lote1);
        Articulo articulo2 = new Articulo("Ford Mustang", 50000, lote1);
        Articulo articulo3 = new Articulo("Seat León", 4000, lote2);
        Articulo articulo4 = new Articulo("Seat Ibiza", 4399, lote2);
        Articulo articulo5 = new Articulo("Seat Cupra", 80000, lote2);
        Pujador pablo = new Pujador("Pablo");
        Pujador sergio = new Pujador("Sergio");
        Pujador maria = new Pujador("María");
        Puja puja1 = new Puja(pablo, lote1, 64000);
        Puja puja2 = new Puja(sergio, lote1, 63700);
        Puja puja3 = new Puja(maria, lote2, 90000);

        pablo.addPuja(puja1);
        sergio.addPuja(puja2);
        maria.addPuja(puja3);

        lote1.addArticulo(articulo1);
        lote1.addArticulo(articulo2);

        lote1.addArticulo(articulo3);
        lote2.addArticulo(articulo4);
        lote2.addArticulo(articulo5);

        subasta1.addLote(lote1);
        subasta1.addLote(lote2);
        System.out.println(subasta1);

        for (Lote lote : subasta1.getLotes()) {
            System.out.println("\t" + lote);
            for (Articulo art : lote.getArticulos()) {
                System.out.println("\t\t" + art);
            }
        }

    }
}
