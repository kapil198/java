import java.util.*;

public class InputInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();

        System.out.println(firstname);

        // length of the any String.
        System.out.println(firstname.length());

        // concatenation the two string

        System.out.println(firstname + lastname);

    }
}