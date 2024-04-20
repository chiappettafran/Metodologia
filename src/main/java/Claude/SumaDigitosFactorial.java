//respuesta en dos veces, aproximadamente 10seg por respuesta

package Claude;/* public class Claude.SumaDigitosFactorial {

    // Función para calcular el factorial de un número
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Función para sumar los dígitos de un número
    public static long sumaDigitos(long n) {
        long suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        long factorial100 = factorial(100);
        System.out.println("Factorial de 100: " + factorial100);

        long sumDigitos = sumaDigitos(factorial100);
        System.out.println("Suma de los dígitos del factorial de 100: " + sumDigitos);
    }
}*/

import java.math.BigInteger;

public class SumaDigitosFactorial {

    // Función para calcular el factorial de un número usando BigInteger
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    // Función para sumar los dígitos de un BigInteger
    public static int sumaDigitos(BigInteger n) {
        int suma = 0;
        String strNum = n.toString();
        for (int i = 0; i < strNum.length(); i++) {
            suma += Character.digit(strNum.charAt(i), 10);
        }
        return suma;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BigInteger factorial100 = factorial(100);
        System.out.println("Factorial de 100: " + factorial100);

        int sumDigitos = sumaDigitos(factorial100);
        System.out.println("Suma de los dígitos del factorial de 100: " + sumDigitos);
        System.out.println("El programa se ejecutó durante "+(System.currentTimeMillis()-startTime)+"ms.");
    }
}
