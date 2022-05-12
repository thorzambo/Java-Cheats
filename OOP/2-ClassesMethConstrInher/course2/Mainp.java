public class Mainp {
      
      public static void main(String[] args) {
            
            Constr leo = new Constr("leo", "zambo", 24, "Light Blue");
            Constr gianky = new Constr("gianky", "zambo", 22, "blue");

            System.out.println(leo);
            System.out.println(gianky);

            System.out.println(leo.name + " " + leo.surname + " " + leo.age + " " + leo.favColor);
            System.out.println(gianky.name + " " + gianky.surname + " " + gianky.age + " " + gianky.favColor);

            Constr[] persons = new Constr[3]; // Array of persons with limited lenght

            Constr person1 = new Constr("gianky", "zambo", 22, "blue");
            Constr person2 = new Constr("sHehes", "zambo", 32, "blue");
            Constr person3 = new Constr("djjd", "zambo", 82, "blue");

            persons[0] = person1;
            persons[1] = person2;
            persons[2] = person3;

            // OR
            Constr[] persons_ = {person1, person2, person3}; // Array of persons

            System.out.println();

            System.out.println(persons);
            System.out.println(persons[0] + " " + persons[1] + " " + persons[2]);

            for(int i = 0; i < persons.length; i++) {
                  System.out.println(persons[i]);
            }
            // opt with persons_ array
            for(int i = 0; i < persons_.length; i++) {
                  System.out.println(persons[i]);
            }

            System.out.println();

            leo.hello(gianky);
            gianky.hello(leo);
            
      }
}
