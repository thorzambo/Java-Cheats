public class Mainp {
      
      public static void main(String[] args) {
            
            Constr leo = new Constr("leo", "zambo", 24, "Light Blue");
            Constr gianky = new Constr("gianky", "zambo", 22, "blue");

            System.out.println(leo);
            System.out.println(gianky);

            System.out.println(leo.name + " " + leo.surname + " " + leo.age + " " + leo.favColor);
            System.out.println(gianky.name + " " + gianky.surname + " " + gianky.age + " " + gianky.favColor);

      }
}
