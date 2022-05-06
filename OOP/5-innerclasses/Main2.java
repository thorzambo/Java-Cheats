public class Main2 {

      public static void main(String[] args) {

            OuterClass out = new OuterClass();
            out.inner();
            OuterClass.InnerClass in = out.new InnerClass();

            in.display();
      }
}
