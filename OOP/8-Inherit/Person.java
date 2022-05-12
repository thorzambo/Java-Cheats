public class Person {

      String name;
      String surname;

      public Person(String name, String surname) {

            this.name = name;
            this.surname = surname;

            System.out.println("Ciao " + name + " " + surname);
      }

      public String toString() {
            String str = this.name + " " + this.surname;
            return str;
      }

      public void hello(Person otherPerson) {
            System.out.println("Ciao " + otherPerson.name + ", I'm " + this.name);
      }
}
