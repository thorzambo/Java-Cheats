import java.util.Scanner;

public class SwitchAlternative {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            System.out.print("Input your Name: ");
            String name = sc.nextLine();
            
            switch (name) {
                  case "Leo":
                        System.out.println("Ciao Leo");
                        break;
                  case "Princy":
                        System.out.println("Ciao Princy");
                        break;
                  case "Fede":
                        System.out.println("Ciao Fede");
                        break;
                  default:
                        System.out.println("Ciao " + name +" chiunque tu sia");

            System.out.println("Grazie per aver detto il tuo nome");
            }
      }
}
