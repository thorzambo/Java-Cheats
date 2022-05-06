public class OuterClass {

      public class InnerClass {
            public void display() {
                  System.out.println("This is an InnerClass");
            }
      }

      public void inner() {
            InnerClass in = new InnerClass();
            in.display();
      }
}
