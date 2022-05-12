public class NameSurname {

      String name;
      String surname;
      static int nrObj;

      NameSurname(String name, String surname) {

            this.name = name;
            this.surname = surname;
            nrObj++;
      }

      public String toString() {
            String str = this.name + " " + this.surname;
            return str;
      }
      
      public static void showNr () {
            System.out.println(nrObj);
      }

}
