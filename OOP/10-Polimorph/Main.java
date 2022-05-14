public class Main {

      public static void main(String[] args) {

            Student student1 = new Student("Student1", "rossi", "class B");
            Teacher teacher1 = new Teacher("Teacher", "dhh", "mate");

            // basically you can't string Teacher or Student for 2 obj
            // You need to use Person which both techer and student are both extended by Person
            Person[] class_ = {student1, teacher1};

            for(Person person : class_) {
                  person.hello();
            }
      }
}
