import java.util.Scanner;

public class While {
      // While loop is interchanable with For loop, literally same
      // While = You don't know the amount of times
      public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Type a number");
      int x = scanner.nextInt();
      
      /** 
       * Usage 1
      */
      int count = 0;
      while (x != 1) {
            System.out.println("Type 1");
            System.out.println("Not the Right Number!");
            x = scanner.nextInt();
            count++;
      }
      System.out.println("You Won after " + count + " times");

      /** 
       * Usage 2
      */
      do {
            System.out.println("Type 2");
            x = scanner.nextInt();
      } while (x != 2);

      System.out.println("Yeahh got 2");


      /** 
       * Usage 3
      */
      while (x <= 10) {
            x += 1;
      }
    }

}
