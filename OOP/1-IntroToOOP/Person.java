public class Person {
      
      String name = "Leo";
      String surname = "Zambo";
      int age = 24;
      double footnr = 42.5;

      // funzione in classe = metodo / funzione particlare della classe
      public String setName(String name) {
            System.out.println(this.name);
            return name;

      }

      public void hi() {
            System.out.println("Loading... Ciao!" + name);
      }
}
