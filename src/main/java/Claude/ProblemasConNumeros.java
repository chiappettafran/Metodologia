package Claude;

import java.util.Scanner;
import java.util.Arrays;

public class ProblemasConNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        String numero = scanner.nextLine();

        if (verificarPropiedad(numero)) {
            System.out.println("La propiedad se cumple para el número " + numero);
        } else {
            System.out.println("La propiedad no se cumple para el número " + numero);
        }
    }

    public static boolean verificarPropiedad(String numero) {
        char[] digitos = numero.toCharArray();
        Arrays.sort(digitos);

        String numeroMayor = new StringBuilder(new String(digitos)).reverse().toString();
        String numeroMenor = new String(digitos);

        int mayor = Integer.parseInt(numeroMayor);
        int menor = Integer.parseInt(numeroMenor);

        int diferencia = mayor - menor;

        return diferencia % 9 == 0;
    }
}