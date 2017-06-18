package pl.rasztabiga;

public class Problem03 {

    public static void main(String[] args) {
        long numberToCheck = 600851475143L;

        for(long i = 2; i <= numberToCheck / 2; i++) {
            if (numberToCheck % i == 0) {
                long factor = numberToCheck / i;
                if (isPrime(factor)) {
                    System.out.println(factor);
                    break;
                }
            }
        }

    }

    private static boolean isPrime(long number) {
        for(long i = number - 1; i > 1; i--) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
