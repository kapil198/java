import javax.sound.sampled.SourceDataLine;

//package Function & Method;

public class PrimeNoInRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void PrimeInRange(int n) {
        int ch = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                ch++;
                System.out.print(i + " ");
            }
        }
    System.out.println();
    System.out.println(ch);
    }

    public static void  main(String args[]) {
        PrimeInRange(10);
        
    }

}
