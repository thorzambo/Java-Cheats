import java.util.Scanner;

public class ScanInput{
    
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            String scanned = sc.next(); // For Strings
            int scannedint = sc.nextInt(); // For Integers
            boolean scannedbool = sc.nextBoolean();// For Booleans
            double scanneddouble = sc.nextDouble(); // For Doubles

            System.out.println(scanneddouble);

      }
}
