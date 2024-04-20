import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.math.BigInteger;
import java.util.Scanner;

import static ChatGPT.Main.calcularFactorial;
import static ChatGPT.Main.sumarDigitos;
import static Claude.SumaDigitosFactorial.factorial;
import static Claude.SumaDigitosFactorial.sumaDigitos;

public class Memoria {
    public static void main(String[] args) {
        MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage beforeHeapMemoryUsage = mbean.getHeapMemoryUsage();

        Object instance  = codeThatCreatesComplexDataStructure();

        MemoryUsage afterHeapMemoryUsage = mbean.getHeapMemoryUsage();
        long consumed =  afterHeapMemoryUsage.getUsed() - beforeHeapMemoryUsage.getUsed();
        System.out.println("Total consumed Memory: " + consumed);
    }

    private static Object codeThatCreatesComplexDataStructure() {
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
        return null;

    }

}
