import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Mapfor {

      public static void main(String[] args) {

            Map map = new HashMap();

            String str = "Hi there, My doggo is Thor, and he is so fucking Cute Maaaan";
            // Maps and for loops:

            //for (char x:str) { // we can't iterate over String
            for (char x:str.toCharArray()) {
                  if (map.containsKey(x)) {
                        int old = (int)map.get(x);
                        map.put(x, old+1);
                  }
                  else {
                        map.put(x, 1);
                  }
            }
            map.remove(' ');
            System.out.println(map);
      }
}

