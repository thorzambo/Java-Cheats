/** 
 * Inner classes are classes inside a class or inside a method
 */ 


public class OuterClass {

      // class inside class
      public class InnerClass {

            // 1 method inside inner class
            public void display() {
                  System.out.println("This is an InnerClass");
            }
      }

      // 1 method in the outer class
      // here it calls the inner class
      public void inner() {
            class InnerClassinMeth {
                  public void displayMeth() {
                        System.out.println("This is an InnerClass in a Method!");
                  }
            }

            // here calls InnerClass 1st
            InnerClass in = new InnerClass();
            in.display();

            // here we call InnerClassinMeth
            InnerClassinMeth in2 = new InnerClassinMeth();
            in2.displayMeth();
      }

}
