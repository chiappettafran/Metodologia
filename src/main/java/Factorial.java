import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public BigInteger factorial(int num1){
        if (num1 == 1){
            return BigInteger.valueOf(num1);
        } else {
            return BigInteger.valueOf(num1).multiply(factorial(num1-1));
        }
    }


    public static void main(String[] args) {

        System.out.print("Ingrese un número: ");
        int factorial1 = new Scanner(System.in).nextInt();

        long startTime = System.currentTimeMillis();
        BigInteger factorial = new Factorial().factorial(factorial1);

        System.out.print("El factorial del número ingresado es: "+factorial);


        int sumaDigitos = 0;
        for (int i = 0; i < factorial.toString().length(); i++){
            sumaDigitos += Character.getNumericValue(factorial.toString().charAt(i));
        }
        System.out.print("\nLa suma de sus dígitos es: "+sumaDigitos);

        System.out.println("\n\nEl tiempo ocupado por el programa fue de "+(System.currentTimeMillis() - startTime)+"ms.");
    }


}
