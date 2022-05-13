public class Student extends Person {

      String favmath = "science";
      String classe = "classe AB";
      String favCourse;
      
      int[] notes = {6, 7, 8};
      
      Student(String name, String surname, String favCourse) {
            super(name, surname);   // stands for upper. Tree wise. same as Persona(String name, String surname) {\n this.name\n same.surname
            this.favCourse = favCourse;
      }

      public void study(String fach) {
            System.out.println("im studying " + fach);
      }

      // @Override
      public void hello() {
            System.out.println("Ciao man");
      }

      public void pref(String favCourse) {
            System.out.println("I like " + favCourse + " and " + this.favCourse);
      }
}
