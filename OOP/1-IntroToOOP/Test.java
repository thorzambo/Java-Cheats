public class Test {
    int age;
    
    public static void main(String [] args) {
      Test p = new Test();
      
      // here we use dot notation to set age
      p.age = 20; 
      
      // here we use dot notation to access age and print
      System.out.println("Age is " + p.age);
      // Output: Age is 20
    }
  }