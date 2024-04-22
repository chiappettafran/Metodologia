import java.util.Scanner;
import java.util.Arrays;

public class PropiededNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = sc.nextLine();  //todo pedir verificacion de numero

        // Convertir el número a un arreglo de dígitos
        int[] digitos = new int[numero.length()];
        for (int i = 0; i < numero.length(); i++) {
            digitos[i] = numero.charAt(i) - '0';
        }

        // Ordenar los dígitos de forma descendente y ascendente
        Arrays.sort(digitos);
        int menor = construirNumero(digitos, 0);
        Arrays.sort(digitos, (a, b) -> (b - a)); // Orden descendente //todo error ordenando de forma descendente el array
        int mayor = construirNumero(digitos, 0);

        // Calcular la resta y verificar si es múltiplo de 9
        int resta = mayor - menor;
        boolean esMultiploDe9 = resta % 9 == 0;

        System.out.println("Número ingresado: " + numero);
        System.out.println("Mayor número formado: " + mayor);
        System.out.println("Menor número formado: " + menor);
        System.out.println("Resta: " + resta);
        System.out.println("¿La resta es múltiplo de 9? " + esMultiploDe9);
    }

    // Función auxiliar para construir un número a partir de un arreglo de dígitos
    private static int construirNumero(int[] digitos, int inicio) {    //todo raaaaaaaaaaro
        int numero = 0;
        for (int i = inicio; i < digitos.length; i++) {
            numero = numero * 10 + digitos[i];
        }
        return numero;
    }
}
