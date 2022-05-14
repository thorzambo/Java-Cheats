import java.util.HashMap;
/**
 * BASICALLY DICTIONARIES -> Key:Value pairs
 */

public class Main {
    
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<String, String>();

        capitals.put("Italy", "Rome");
        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");

        System.out.println(capitals);

        System.out.println(capitals.get("Germany"));

        capitals.remove("France");
        capitals.clear();
        System.out.println(capitals); //{}
    }
}


