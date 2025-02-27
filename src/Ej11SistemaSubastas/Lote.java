package Ej11SistemaSubastas;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String nombre;
    private Subasta subasta;
    private Set<Articulo> articulos;
    private Set<Puja> pujas;

    public Lote(String nombre, Subasta subasta) {
        this.nombre = nombre;
        this.subasta = subasta;
        this.articulos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public double precioLote(){
        return articulos.stream().map(Articulo::getPrecio).mapToDouble(Double::valueOf).sum();
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\tPrecio de salida:" + this.precioLote();
    }
}
