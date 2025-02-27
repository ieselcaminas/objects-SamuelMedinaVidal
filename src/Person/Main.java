package Person;

public class Main {
    public static void main(String[] args) {
        System.out.println(validarDNI("12345678Z")); // Debería imprimir true si es válido
    }

    public static boolean validarDNI(String dni) {
        if (dni == null || !dni.matches("\\d{8}[A-Za-z]")) {
            return false;
        }
        String numeros = dni.substring(0, 8);
        char letra = Character.toUpperCase(dni.charAt(8));
        int num = Integer.parseInt(numeros);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(num % 23) == letra;
    }
}
