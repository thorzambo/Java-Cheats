/**
 * Inherit Methods and Attributes previously set
 * New Class, Overwrite Methods etcetc
 * Saves Time
 */

/**
 * I want to create a Cat Class, Identical to Dog class but with some differences:
 * We will be able to use all Dog's methods and functionalities
 */

public class Cat extends Dog { // Extend is going to get everything from Dog Class and use inside the Cat Class. Dog is Parent Class, Cat is Child Class.
      
      private String food;
      
      public Cat(String name, int age, String food) { // We firstly need to input the Dog class..., then add like, food
            super(name, age);
            this.food = food;
      }


      //Keep Cat, keeping only choosen variables, Like, If the Cat want to not provide some infos lets say
      public Cat(String name, int age) {
            super(name, age);
      }

      // in case you want to keep some of these and needs to be declared into SUPER, you need to hard code them, can't be blank
      public Cat(String name, String food) {
            super(name, 0);
            this.food = food;
      }

      // example ^^
      public Cat(String name){
            super(name, 0);
      }

      // overwrite the Dog's Speak Method, adding food
      public void speak() { // since we are going to use name, it needs to be changed from private to public
            System.out.println("Meow my name is " + this.name + " My age is private, but I love " + this.food);
      }

      public void eat(String x) {
            this.food = x;
            System.out.println("I eat " + x);
      }
}     
