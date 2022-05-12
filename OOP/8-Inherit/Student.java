public class Student extends Person {

      String favmath = "science";
      String classe = "classe AB";
      int[] notes = {6, 7, 8};
      
      Student(String name, String surname) {
            super(name, surname);
      }

      public void study(String fach) {
            System.out.println("im studying " + fach);
      }

      void hello() {
            System.out.println("Ciao man");
      }
}
