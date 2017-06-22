package pl.rasztabiga;

import java.util.ArrayList;
import java.util.List;

public class Problem010 {

    private static List<Integer> primesBelowTwoMillion = new ArrayList<>();

    public static void main(String[] args) {
        primesBelowTwoMillion.add(2);

        for (int i = 3; i < 2000000; i += 2) {
            System.out.println(i);
            if (isPrime(i)) primesBelowTwoMillion.add(i);
        }

        long sum = primesBelowTwoMillion.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }

    private static boolean isPrime(int number) {
        for (Integer prime : primesBelowTwoMillion) {
            if (number % prime == 0) return false;
        }

        for (long i = number - 1; i > 1; i--) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
