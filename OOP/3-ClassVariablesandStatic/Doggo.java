import java.util.Scanner;

public class Doggo {

      public String name;
      private int age;

      public Doggo(String name, int age){ 
            this.name = name;
            this.age = age; 
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


}
