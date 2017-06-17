package pl.rasztabiga;

import java.util.ArrayList;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    public static void main(String[] args) {
        List<Integer> foundMultiples = new ArrayList<>();
        for (int i = 1000; i > 0; i--) {
            if(i % 3 == 0 || i % 5 == 0) {
                foundMultiples.add(i);
            }
        }

        int sum = foundMultiples.stream()
                .mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
