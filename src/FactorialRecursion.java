import java.sql.SQLOutput;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("***************** ----- FACTORIALES CON RECURSIÓN: ----- *****************");
        System.out.println("El factorial de 7 es: " + fact(7));
        System.out.println("El factorial de 15 es: " + fact(15));
        System.out.println("El factorial de 3 es: " + fact(3));
        System.out.println("El factorial de 1 es: " + fact(1));
        System.out.println("El factorial de 25 es: " + fact(25));
        System.out.println("\n***************** ----- Ahora los FIBONACCI CON RECURSIÓN: ----- *****************");
        System.out.println("El fibo5 es: " + fibo(5));
        System.out.println("El fibo6 es: " + fibo(6));
        System.out.println("El fibo7 es: " + fibo(7));
        System.out.println("El fibo8 es: " + fibo(8));
        System.out.println("El fibo4 es: " + fibo(4));
    }

    public static long fact(long number) {

         if (number >= 2){
            return number * fact(number-1);
        }

        return 1;

    }

    public static long fibo (long number) {

        if (number <=2){
            return 1;
        }
        else if (number >= 3){
            return fibo(number-1) +  fibo(number-2);
        }
        return 1;

    }
}
