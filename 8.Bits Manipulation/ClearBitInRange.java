import java.util.*;

public class ClearBitInRange {

    public static int clearBitinRange(int n, int i, int j) {

        int a = (~(0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n | bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(clearBitinRange(n, i, j));

    }

}
