public class EqualProperty {
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("s1 and s2 are equal");

        } else {
            System.out.println("String are not equal");
        }

        if (s2 == s3) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are  not equal");
        }
        // use the .equals() function
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equals");
        }
    }

}
