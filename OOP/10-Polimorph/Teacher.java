import java.util.ArrayList;

public class Teacher extends Person {

      String fach;
      ArrayList<String> things;

      public Teacher(String name, String surname, String fach) {
            super(name, surname);
            this.fach = fach;
      }

      public void Materie(String what, ArrayList<String> things) {
            for(int i = 0; i < things.size(); i++) {
                  System.out.println(what + " " + things.get(i));
            }
      }
}
