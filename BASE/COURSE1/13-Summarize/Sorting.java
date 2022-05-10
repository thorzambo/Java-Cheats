import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
      
      public static void main(String[] args) {

            int[] x = {1,4,6,7,6,22,4,5};
            
            Arrays.sort(x); // or add indexes - > Arrays.sort(x, 1,6);
            for (int i:x) {
                  System.out.print(i + ",");
            }
      }
}
