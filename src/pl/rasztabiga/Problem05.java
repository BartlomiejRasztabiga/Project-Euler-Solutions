package pl.rasztabiga;

public class Problem05 {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (isDivisible(i)) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    private static boolean isDivisible(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) return false;
        }

        return true;
    }
}
