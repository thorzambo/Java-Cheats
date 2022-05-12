/**
 * Metods which have the same name, utilized in diff ways
 */

public class OverloadedMethods {

      public static void main(String[] args) {

      }

      static int addict(int a, int b) {
            int result = a + b;
      } // need to change parameters only
      static int addict(int a, int b, int c) {
            int result = a + b;
            return result;
      } // need to change double from int
      static double addict(double a, int b) {
            double result = a + b;
            return result;
      }
}
