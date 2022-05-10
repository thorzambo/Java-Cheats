import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * A Set is just like a big Bubble where you throw things in it.
 * It does not where they are, it knows they are there.
 * Set + < INTEGER > + new HASHSET(standard impl of set) and again <INTEGER> (here you put some other elements, like another set)
 */

public class Sets{
      
      public static void main(String[] args){

            Set<Integer> set = new HashSet<Integer>(); // ordered randomly
            Set<Integer> treeset = new TreeSet<Integer>(); // Similar to treeset, you can only have one time the same elemnt, gives an order tho. tree functionality
            Set<Integer> linkedset = new LinkedHashSet<Integer>(); // same as HashSet, but faster in certain operations 
            set.add(5);
            set.add(6);
            set.add(7);
            set.add(2);
            set.add(5); //second 5 wont be added to the set
            set.remove(5); //removes
            //set.clear(); //clears
            set.isEmpty(); //true or false
            set.size(); //How many elements


            System.out.println(set); //Hashset does not have an order.

            boolean x = set.contains(5); // contains? Its really really fast

            System.out.println(x);
            
      }
}
