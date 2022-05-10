import java.util.Scanner;

public class Summary{

      public static void main(String[] args) {
            System.out.println("Imput Your Age:");
            Scanner scanner = new Scanner(System.in);
            String scan = scanner.nextLine();
            int age = Integer.parseInt(scan);

            if (age >= 18){
                  System.out.println("You Are old enough, you can Drink!");
                  System.out.println("What would you like to drink?");
                  String food = scanner.nextLine();

                  System.out.println("Alright! "+ food + " incoming!");

                  if (food.equals("Pizza")){
                        System.out.println("You can't drink Pizza tho...");
                  }

            }
            else if (age <= 10){
                  System.out.println("Where are your parents?");
            }
            else {
                  System.out.println("You cannot Drink, kid");
            }
            System.out.println("See you soon!");
      }
}
