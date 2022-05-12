public class Main0{

      public static void main(String[] args){

            Dog thor = new Dog("Thor", 4);
            thor.speak(); // here we practically call the class Dog through Thor, and we then call the method speak(). 
                          //In each of these Variables, we are storing the Dog object, with these Name-Age attributes object .
            Dog scooby = new Dog("Scooby", 14);
            scooby.speak();
            Dog daffy = new Dog("Daffy", 7);
            daffy.speak();
            Dog book = new Dog("Book", 9);
            book.speak();

            System.out.println(thor.getAge());

            /**
             * In Python we can get name by thor.age() method. In Java we cannot. We need to build a new Method. + Because age is private.
             * System.out.println(thor.getAge()); after we create getAge method
            */

            thor.setAge(12);
            thor.speak();

            Cat leo = new Cat("Leo", 18, "Pizza");
            leo.speak();
            leo.eat("Pollo");

            System.out.println(thor.toString());

      }
}
