import java.util.ArrayList;

public class Main {

      public static void main(String[] args) {
            Student leo = new Student("Leo");
            Student leo2 = new Student("Leo");
            Student mike = new Student("Mike");
            Student thor = new Student("Thor");

            System.out.println(leo == leo2); // compares memory objects not string aka will return false
            System.out.println(leo.equals(leo2)); // comparesthe string. equals method has been added into Student.java
            System.out.println(leo.compareTo(thor)); // how far away the letter is from the letter other
      }



}
