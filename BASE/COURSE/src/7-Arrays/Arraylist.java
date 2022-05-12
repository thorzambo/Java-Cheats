import java.util.ArrayList;

/**
 * Array Lists are Arrays that can change theyr size
 * you canL:
 * Create
 * Add elements add()
 * get elements get()
 * modify elements set()
 * remove elements remove(), clear() for all elements
 */

public class Arraylist {

      public static void main(String[] args) {
                        //add refredence in <>
            ArrayList<String> people = new ArrayList<String>(); // Here we can't use int but INTEGER because is primitive

            people.add("Leo");
            people.add("Fede");
            people.add("Ale");

            System.out.println(people);
            System.out.println(people.get(0));
            for (String name: people) {
                  System.out.print(name + " ");
            }

            System.out.println();
            
            for (int i = 1; i < people.size(); i++) {
                  System.out.print(people.get(i));
            }

            System.out.println();

            people.set(2, "Thor");

            for (String name: people) {
                  System.out.print(name);
            }
      }
}

