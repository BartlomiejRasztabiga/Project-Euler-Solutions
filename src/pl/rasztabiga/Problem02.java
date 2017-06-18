package pl.rasztabiga;

import java.util.ArrayList;
import java.util.List;

public class Problem02 {

    public static void main(String[] args) {
        List<Integer> fibonacciToFourMillion = findFibonacciToFourMillion();
        long sum = fibonacciToFourMillion.stream()
                .filter(e -> e % 2 == 0)
                .mapToLong(Integer::intValue)
                .sum();

        System.out.println(sum);
    }

    private static List<Integer> findFibonacciToFourMillion() {
        List<Integer> fibonacci = new ArrayList<>();
        int i = 1;
        while (true) {
            int fibonacciNumber = fibonacci(i);
            i++;
            if (fibonacciNumber >= 4000000) break;
            else fibonacci.add(fibonacciNumber);
        }

        return fibonacci;
    }

    private static int fibonacci(int i) {
        if (i == 0) return 0;
        else if (i == 1) return 1;
        else return fibonacci(i - 1) + fibonacci(i - 2);
    }

}
