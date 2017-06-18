package pl.rasztabiga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers
 */
public class Problem04 {

    public static void main(String[] args) {
        //largest number as product of two 3-digit numbers is 999 * 999 (998 001)
        long firstNumber, secondNumber;

        List<Long> palindromeNumbers = new ArrayList<>();

        for (firstNumber = 999; firstNumber >= 100; firstNumber--) {
            for (secondNumber = 999; secondNumber >= 100; secondNumber--) {
                long numberToCheck = firstNumber * secondNumber;
                if (isPalindrome(numberToCheck)) palindromeNumbers.add(numberToCheck);
            }
        }

        System.out.println("Highest palindrome number as a product of two 3-digits numbers is " + Collections.max(palindromeNumbers));
    }

    private static boolean isPalindrome(long number) {
        String numberString = String.valueOf(number);
        String numberStringReverted = new StringBuffer(numberString).reverse().toString();

        return numberString.equals(numberStringReverted);
    }

}
