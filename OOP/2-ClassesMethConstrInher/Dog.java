import java.util.Scanner;

public class Dog {

      /** 
      * Attributes are variables that hold informations for us
      * Here we want age and name attirbutes
      * Private means that attribute will be accessible inside this specific class only
      * Public means that attribute will be accessible in different classes too
      */

      /*
      // *** protected String name **** means, only classes within the same package can access to this attribute
      // *** Protected applies to methods too.
      */
      
      public String name;
      private int age;

      // public attributes blabla. Is a better practice to use private things in order to avoid spaghetti code. Same goes for METHODS

      /**
       * Constructor Methods:
       * You typically need to create 1 only of these, you can't create multiples
       * This is going to run whenever we run this dog class
       */

      public Dog(String name, int age){ // in here we will paste paramenters/info that we need to put when creating a dog object. In our case NAME AND AGE;
            this.name = name;
            this.age = age;   //this. set values/attributes, equal to, whatever we pass in (). like self in Python. Its referencing the attributes of the class. Will look into the brackets     
            add2();
      }

      // new method:
      public void speak(){
            System.out.println("I am " + this.name + " and I am " + this.age + " Years old, Bark!");
      }

      // new mothod:
      public int getAge(){
            return this.age;
      }

      // new method: If we want to change Age
      public void setAge(int age){
            this.age = age;
      }

      //this is a private method. That means we can use the method only inside the Dog class
      private int add2() {
            return this.age + 2;
      }

      public String toString(){
            String str = this.name + " " + this.age;
            return str;
      }


}
