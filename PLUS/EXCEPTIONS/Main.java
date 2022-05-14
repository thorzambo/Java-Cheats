import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Inset a number: ");
            int x = scanner.nextInt();

            System.out.println("Insert one more number: ");
            int y = scanner.nextInt();

            try {
                int result = x/y;
                System.out.print(result);
            }
            catch (Exception e) {
                System.out.print(e + " " + e.getMessage());
            }
        }
        catch(Exception e) {
            System.out.println(e + ": " + e.getMessage());
        }
    }
}
