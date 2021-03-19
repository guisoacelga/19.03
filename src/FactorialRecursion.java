public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

    public static long fact(long number) {

         if (number >= 2){
            return number * fact(number-1);
        }

        return 1;

    }
}
