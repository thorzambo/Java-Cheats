public class Constr {

      String name;
      String surname;
      int age;
      String favColor;

      public Constr(String name, String surname, int age, String favColor) {

            this.name = name;
            this.surname = surname;
            this.age = age;
            this.favColor = favColor;

            System.out.println("Ciao " + name + " " + surname + " " + age + " " + favColor);
      }

      public String toString() {
            String str = this.name + " " + this.surname + " " + this.age + " " + this.favColor;
            return str;
      }
}
