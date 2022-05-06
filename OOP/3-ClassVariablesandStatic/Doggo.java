import java.util.Scanner;

public class Doggo {

      /** STATIC KEYWORD
       * Class Variables have attributes
       * Which are specific to each instance of Dog. Each Dog will have its own age and name
       * We can then have multiple diff object
       * 
       * Sometimes we want to have variables that change at one instance, changes a second instance
       * these are Class Variables
       */

      protected static int count = 0; // Class variable protected - Static is gallowing to change all together
      

      protected String name; // instance variables
      protected int age;

      public Doggo(String name, int age){ 
            this.name = name;
            this.age = age; 
            Doggo.count += 1; //needs to be DOGGO because since that is a static variable does not care which instance is going to change because it changes for ALL instances
            //this.count += 1; // will work still, but is better to call class.
            Doggo.display_static(); // allows us to call it because is static.
            // Doggo.display_normal(); //Error because we need an instance to call instance normal. we need a doggo beig created and calling it.@interface
      }

      public void display_normal() {
            System.out.println("I am a nromal Doggo");
      }

      public static void display_static() {
            System.out.println("I am a static Doggo");
            // this.age; not working cause we need to call a Doggo. onrly normal instance NOT static allows it
      }
}
