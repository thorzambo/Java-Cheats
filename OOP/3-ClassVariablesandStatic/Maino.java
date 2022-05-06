public class Maino{

      public static void main(String[] args){

            Doggo thor = new Doggo("Thor", 4);
            thor.speak(); // here we practically call the class Dog through Thor, and we then call the method speak(). 
                          //In each of these Variables, we are storing the Dog object, with these Name-Age attributes object .
            Doggo scooby = new Doggo("Scooby", 14);
            scooby.speak();
            Doggo daffy = new Doggo("Daffy", 7);
            daffy.speak();
            Doggo book = new Doggo("Book", 9);
            book.speak();

            System.out.println(thor.getAge());

            /**
             * In Python we can get name by thor.age() method. In Java we cannot. We need to build a new Method. + Because age is private.
             * System.out.println(thor.getAge()); after we create getAge method
            */

            thor.setAge(12);
            thor.speak();
            
      }

}
