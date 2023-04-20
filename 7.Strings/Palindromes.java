import java.util.*;

public class Palindromes {

    public static boolean isPalindrome(String a) {
        int n = a.length();
        for (int i = 0; i < n / 2; i++) {
            if (a.charAt(i) != a.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(isPalindrome(a));
    }

}
