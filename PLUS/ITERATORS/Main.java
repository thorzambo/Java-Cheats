import java.util.*;
    /**
     * Helps Cycling collections of datas like Arrays
     */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("ciao");
        persons.add("fhfhd");
        persons.add("ubchua");

        Iterator<String> personsIt = persons.iterator();

        System.out.println(personsIt);
        System.out.println(personsIt.hasNext());
        System.out.println(personsIt.next());

        while(personsIt.hasNext()) {
            System.out.println(personsIt.next());
            String person = personsIt.next();
            if(person == ("fhfhd")) {
                personsIt.remove();
            }
        }
        System.out.println(persons);
        for(String person : persons){
            System.out.print(person + " ");
        }
    }
}
