import java.util.*;

public class SubString {

    public static String printSubstring(String str, int si, int ei) {

        String Substr = " ";
        for (int i = si; i < ei; i++) {
            Substr += str.charAt(i);
        }

        return Substr;
    }

    public static void main(String args[]) {

        String str = "AakashKapilAakash";
        String a = printSubstring(str, 6, 11);
        System.out.println(a);
    }

}
