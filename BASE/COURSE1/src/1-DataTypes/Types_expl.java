/**
 * boolean -> true : false -> 1 bit
 * byte -> -128 : 127 | 1 byte
 * short -> -32768 : 32767 | 2 bytes
 * int -> -2 bilions : 2 bilions -> 4 byte
 * long -> -9 quintilions : 9 quintilions -> 8 bytes
 * 
 * flot -> nr with 6-7 decimals e.g. 5.233223f -> 4 bytes
 * double -> nr with 15 decimals e.g. 5.238474747474747474 -> 8 bytes
 * 
 * char -> single character / letters / ASCII characters 'f' -> 2 bytes
 * Strin -> Characters Sequence "blah labdhd " -> variable
 * 
 * difference between primitive types and reference types (initials and available metyhods)
 */

public class Types_expl {
      /* 
      * METHODS
      */
      public static void main(String[] args) {
            // OOP Language aka everything works within classes and objects. Always ; at the end of any string
            System.out.println("Test String, Lets finally learn JAVA");

            // TYPES _ Variables:

            /*
            * Primitive Datatypes: Not Changeble
            */

            int hello = 5; //integer number
            double hello_float = 5.5;//float number
            boolean bool_t = true; 
            boolean bool_f = false; // Note that they r written in lowercase
            char character = 'c'; // Single Quotation mark character 
            int leo = hello;

            // Not primitive

            String phrase = "Hi man, how is it going"; //Note its Double Quotation Marks

            System.out.println(leo);
      }
}
