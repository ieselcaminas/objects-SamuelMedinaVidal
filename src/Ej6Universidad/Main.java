package Ej6Universidad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AreaConocimiento areaConocimiento = new AreaConocimiento("Ingeniería de Software", 1);
        Departamento departamento = new Departamento("Departamento de Informática", 101, areaConocimiento);
        Facultad facultad = new Facultad("Facultad de Ciencias y Tecnología");
        Catedra catedra = new Catedra("Cátedra de Programación", 1001, departamento, facultad);
        Profesor profesor1 = new Profesor("Dr. Juan Pérez", 201);
        Profesor profesor2 = new Profesor("Dra. María Gómez", 202);

        Date fechaActual = new Date();
        Adscripcion adscripcion1 = new Adscripcion(profesor1, catedra, fechaActual);
        Adscripcion adscripcion2 = new Adscripcion(profesor2, catedra, fechaActual);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n--- Datos de la Universidad ---");
        System.out.println(areaConocimiento);
        System.out.println(departamento);
        System.out.println(facultad);
        System.out.println(catedra);

        System.out.println("\n--- Profesores y Adscripción ---");
        System.out.println(profesor1);
        System.out.println(profesor2);
        System.out.println("Adscripción 1: " + profesor1.getNombre() + " -> " + catedra.getNombre() + " en fecha " + sdf.format(adscripcion1.getData()));
        System.out.println("Adscripción 2: " + profesor2.getNombre() + " -> " + catedra.getNombre() + " en fecha " + sdf.format(adscripcion2.getData()));
    }
}
