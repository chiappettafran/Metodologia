package Claude;

import java.util.Arrays;
import java.util.Scanner;

public class MultiploDeNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = scanner.nextLine();

        int mayor = getMayor(numero);
        int menor = getMenor(numero);

        int diferencia = mayor - menor;

        if (diferencia % 9 == 0) {
            System.out.println("La diferencia " + diferencia + " es múltiplo de 9.");
        } else {
            System.out.println("La diferencia " + diferencia + " no es múltiplo de 9.");
        }
    }

    private static int getMayor(String numero) {
        char[] digitos = numero.toCharArray();
        Arrays.sort(digitos);
        StringBuilder sb = new StringBuilder();
        for (int i = digitos.length - 1; i >= 0; i--) {
            sb.append(digitos[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    private static int getMenor(String numero) {
        char[] digitos = numero.toCharArray();
        Arrays.sort(digitos);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] != '0') {
                sb.append(digitos[i]);
                break;
            }
        }
        for (int i = 1; i < digitos.length; i++) {
            sb.append(digitos[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}
