public class Wrapperclass {
      // allows us to us primitive types as references type classes
      public static void main(String[] args) {
            
            Boolean tr = true;
            Character carac = 'a';
            Integer in = 3;
            Double dbl = 3.45;
            String str = "String";

            boolean a = true;
            char car = 'a';
            int x = 3;
            double d = 3.45;

            System.out.println(tr == a);
            System.out.println(carac == car);
            System.out.println(in == x);
            System.out.println(dbl == d);

            // Demostration is the exact same
      }
}
