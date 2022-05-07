public class Main2 {

      public static void main(String[] args) {

            // 2 ways to access the inner class:

            OuterClass out = new OuterClass();
            
            //out.inner(); // we can do this onkly if inner class is public not PRIVATE

            OuterClass.InnerClass in = out.new InnerClass();
            in.display();

            // For inner meth class
            OuterClass out2 = new OuterClass();
            out2.inner();
      }
}
