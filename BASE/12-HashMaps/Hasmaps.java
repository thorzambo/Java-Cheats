import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

// HASMAPS ARE LIKE DICTIONARIES: KEY = VALUE PAIR

public class Hasmaps {

      public static void main(String[] args) {

            Map map = new HashMap(); 
            Map treemap = new TreeMap(); //KEYS MUST BE THE SAME TYPE
            Map linkedmap = new LinkedHashMap(); // Keeps the order

            map.put("Leo", 8);
            map.put("Thor", "Lucy");
            map.put("Princy", "Studia");
            map.put("Leo", 8);

            map.containsValue("Lucy"); //checks if value is present in map
            map.containsValue("Princy"); //checks if value is present in map
            map.get("shesh"); // does not crash like python if key does not exist
            map.values(); // get all values
            map.clear(); // clear
            map.isEmpty(); 
            
            System.out.println(map);
      }

}
