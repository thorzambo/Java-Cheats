public class Person {

      private String name;
      private String surname;

      public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
      }

      public String getName() {
            return name;
      }

      public String getSurname() {
            return surname;
      }

      public String setName(String name) {
            return this.name = name;
      }
      
      public String setSurname(String surname) {
            return this.surname = surname;
      }

      public void copy(Person other) {
            this.name = other.getName();
            this.surname = other.getSurname();
      }
}
