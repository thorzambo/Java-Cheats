public class MethodsFunctions {

      public static void main(String[] args) {
            cook("Shesh");
            System.out.println(cook("Shjesh"));

            int total = summm(23);
            System.out.println(total);

      }
      
      static String cook(String pz) {
            System.out.println("Get the stuff you want to use x " + pz);
            String cook = pz;
            return cook;
      }

      static int summm(int x) {
            int result = x*x;
            return result;
      }
}


