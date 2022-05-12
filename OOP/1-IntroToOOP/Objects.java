import java.util.Scanner;

public class Objects {

      /**
       * OBJECTS:
       * An object is an instance of a certain Data Type like bool string int double etcetc Haslist Hashtables Arrays -> Data Types or Classes
       * 
       * For example: Scanner scan = new Scanner();
       * We are pointing the variable scan to the class Scanner Object.
       * 
       * Another Example: int x = 1;
       * int object of value 1;
       * 
       * Different Object -> different Data Types different Properties.
       * 
       * Whenever you want to create different new variable, you are saying that for example String object, variable str with the value "hello"
       * String str = "hello";
       * Here you create an object of that Type
       * 
       * An instance is the variable, like str, scan or x
       * 
       * String str = "hello";
       * str.length(); is a method
       * 
       * Data Type = What an Object is created of
       * 
       * A method is anything that sits inside a class
       * A class is anything that defines a Data Type
       * 
       * by importing:
       * import java.util.Scanner;
       * 
       * we do import a class of java which looks like:
       * 
       * public class Scanner {
       *    
       *    public static void main(String[] args) {
       * 
       *    // ***** here has all methods that defines its rules *****
       *    }
       * }
       * 
       */

      public static void main(String[] args) { // This is a specific method which runs whenever we run the program

            String h = "hello";
            h.length();
            System.out.println(h.length());

            leo("Hello", 24);
            System.out.println(add2(2));
            System.out.println(str("WTF"));
      }

      public static void leo(String str, int x) { //() parameters
            /** void means it wont return nothing. Literally like return in Python
             * We just print Leo
             * 
             * If we want to pass something into the Leo function: we just need to input paramenters like: String str.
            */
            System.out.println(str +" Leo " + x + " YO");

            for (int i = 0; i< str.length(); i++) {
                  System.out.println(str);
                  //i = i-1; inf loop
            }
      }

      public static int add2(int x) { // here we return something: A VALUE INT
            return x+2;
      }
      
      public static String str(String x) { // here we return a string
            return x + " sheeesh";
      }
      
}
