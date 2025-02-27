package Ej2AireAcondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AireAcondicionado a1 = new AireAcondicionado("Hisense", 28.00, 18.00);

        System.out.println("Dime la temperatura inicial del aire acondicionado: ");
        a1.setTemperatura(scanner.nextDouble());

        System.out.println(a1);

        while (true) {
            System.out.println("¿Quieres subir (1) o bajar (2) la temperatura? (Otro número para salir): ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                a1.subirAireAcondicionado();
            } else if (opcion == 2) {
                a1.bajarAireAcondicionado();
            } else {
                break;
            }

            System.out.println(a1);
        }

        System.out.println("Programa finalizado.");
    }
}
