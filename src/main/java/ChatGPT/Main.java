//respuesta correcta a la primera, alrededor de 25seg

package ChatGPT;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Calcular el factorial de 100
        BigInteger factorial = calcularFactorial(100);

        // Convertir el factorial en una cadena
        String factorialStr = factorial.toString();

        // Calcular la suma de los dígitos del factorial
        int sumaDigitos = sumarDigitos(factorialStr);

        // Imprimir el resultado
        System.out.println("La suma de los dígitos del factorial de 100 es: " + sumaDigitos);
        System.out.println("El programa se ejecutó durante "+(System.currentTimeMillis()-startTime)+"ms.");
    }

    // Método para calcular el factorial de un número
    public static BigInteger calcularFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    // Método para sumar los dígitos de una cadena numérica
    public static int sumarDigitos(String str) {
        int suma = 0;
        for (int i = 0; i < str.length(); i++) {
            suma += Character.getNumericValue(str.charAt(i));
        }
        return suma;
    }
}
