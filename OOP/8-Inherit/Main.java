public class Main {

      public static void main(String[] args) {
            
            Person person1 = new Person("thor", "threello");

            Student student1 = new Student("Leo", "threello", "Mate");
            student1.hello();     

            Teacher teacher1 = new Teacher("Claudio", "threello");

            student1.pref("Matematics");     
      }
}
