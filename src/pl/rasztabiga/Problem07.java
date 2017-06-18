package pl.rasztabiga;

public class Problem07 {

    public static void main(String[] args) {
        long i = 2;
        long count = 0;
        long first = 0;
        while(true) {
            if (count == 10001) break;
            if(isPrime(i)) {
                first = i;
                count++;
                System.out.println(count + " number is " + first);
            }
            i++;
        }

        System.out.println(first);
    }

    private static boolean isPrime(long number) {
        for (long i = number - 1; i > 1; i--) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
