import java.math.BigInteger;

public class Combination {

    public static BigInteger calculateCombination(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO;
        }

        if (r > n / 2) {
            r = n - r;
        }

        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;

        for (int i = 0; i < r; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(n - i));
            denominator = denominator.multiply(BigInteger.valueOf(i + 1));
        }

        return numerator.divide(denominator);
    }

    public static void main(String[] args) {
        int n = 70;
        int r = 10;
        BigInteger result = calculateCombination(n, r);
        System.out.println("The value of " + n + "C" + r + " is: " + result);
    }
}
