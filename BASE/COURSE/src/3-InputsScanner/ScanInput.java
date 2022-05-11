import java.util.Scanner; //Import package to use Scanner = Input

public class ScanInput{
    
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            //String scanned = sc.next(); // For Strings
            /*
                  int scannedint = sc.nextInt(); // For Integers
                  boolean scannedbool = sc.nextBoolean();// For Booleans
                  double scanneddouble = sc.nextDouble(); // For Doubles 
            */
            int x = Integer.parseInt(scanned);    // transalte string into integer (obv wont work with words)

            System.out.println(x);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Whatever you want to: ");
            String smth = scanner.nextLine();

            System.out.println("Ciao " + smth);

            System.out.print("Age?: ");
            int eta = scanner.nextInt();

            scanner.nextLine(); // needed in this case cause it goes newline
            System.out.print("Age?: ");
            String shesh = scanner.nextLine();

      }
}


