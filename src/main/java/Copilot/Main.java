//tambien funciona a la primera, la respuesta fue generada en un minuto aprox.

package Copilot;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        BigInteger sum = BigInteger.ZERO;
        while (factorial.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(factorial.mod(BigInteger.TEN));
            factorial = factorial.divide(BigInteger.TEN);
        }

        System.out.println("La suma de los dígitos del factorial de 100 es: " + sum);
        System.out.println("El programa se ejecutó durante "+(System.currentTimeMillis()-startTime)+"ms.");
    }
}
