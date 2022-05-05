import java.util.Scanner;

public class Statements{

      public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            String scanner = scan.nextLine();

            if (scanner.equals("Leo")){
                  System.out.println("You Typed My Name!");
            }
            else if (scanner.equals("hello")){
                  System.out.println("Well... Hi!");
            }
            else if (scanner.equals("Sheeesh")){
                  System.out.println("Sheeeeeeeeeeeeeeeeeesh");
            }
            else {
                  System.out.println("You Did Not Type My Name!");
            }
            System.out.println("Program FInished!"); // Runs in Any Case since thats out of parentheses
            
      }
}
