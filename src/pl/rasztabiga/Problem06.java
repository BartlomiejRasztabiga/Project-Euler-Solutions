package pl.rasztabiga;

public class Problem06 {

    public static void main(String[] args) {
        System.out.println(squareOfSum(100) - sumOfSquares(100));
    }

    private static long sumOfSquares(int to) {
        long sum = 0;
        for (int i = 1; i <= to; i++) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }

    private static long squareOfSum(int to) {
        long sum = 0;
        for (int i = 1; i <= to; i++) {
            sum += i;
        }

        return (long) Math.pow(sum, 2);
    }
}
