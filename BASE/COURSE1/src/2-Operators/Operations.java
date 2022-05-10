public class Operations {
    
      public static void main(String[] args) {
            int x; //We just declared x is a variable, no value Yet. We declared it but we did not initialized it -> Operations.java:6: error: variable x might not have been initialized
            x = 5; // x now have been initialized -> prints 5

            int y = 7;
            int z = 8;
            double sum = x/y+z; // if double out of integers, we get integers. We need to 1: change both mult in doubles. 2: We  change 1 only. 1 Is enough
            System.out.println(sum);

            int r = 4;
            double u = 5;
            double divdouble = r/u;

            int f = 65 % 9;

            System.out.println(divdouble);

      }
}
