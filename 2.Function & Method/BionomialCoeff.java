
//package Function & Method;
import java.util.*;

public class BionomialCoeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinomialCofficient(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int BC = a / (b * c);
        return BC;
    }

    public static void main(String args[]) {
        System.out.println(BinomialCofficient(5, 2));
    }
}
