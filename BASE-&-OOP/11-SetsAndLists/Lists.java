import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A Set is just like a big Bubble where you throw things in it.
 * It does not where they are, it knows they are there.
 * Set + < INTEGER > + new HASHSET(standard impl of set) and again <INTEGER> (here you put some other elements, like another set)
 */

public class Lists{
      
      public static void main(String[] args){

            ArrayList<Integer> list = new ArrayList<Integer>(); // similar to set, dinamically sized array, same property but like slower, and ordered.
            LinkedList<Integer> linkedlist = new LinkedList<Integer>(); //similar to list but faster in certain operations
            list.add(1);
            list.add(2);
            list.remove(1);
            list.get(0); // Gives element in that index;
            list.set(0,5); // Sets at index 1 , the element 5; (only if you have already something in that position)
            list.size();
            list.isEmpty(); 
            list.subList(0, 0); // Allows us to get from index x to index y these elements



            System.out.println(list);


      }
}
