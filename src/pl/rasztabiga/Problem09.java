package pl.rasztabiga;

public class Problem09 {

    public static void main(String[] args) {
        for (int a = 1; a <= 998; a++) {
            for (int b = 1; b <= 998; b++) {
                for (int c = 1; c <= 998; c++) {
                    if (a + b + c == 1000) {
                        if (isSquare(a, b, c)) {
                            System.out.println(a*b*c);
                        }
                    }
                }
            }
        }
    }

    private static boolean isSquare(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
