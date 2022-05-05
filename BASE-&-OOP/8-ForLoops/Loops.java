public class Loops {

      public static void main(String[] args){

            int x = 100;
            int[] arr = {1,4,5,7,3,8,2,1,0};

            /* 
            ** How **
            Declare a Variable; -> int i = 0;
            Set a condition, like: till i is smaller than 100; i < 100
            lastly, untill that condition is not reached, add 1 to i i++
            */

            for (int i = 0; i < 10000; i++) {
                  System.out.print(i);
            }

            for (int i = 0; i < x; i++) {
                  System.out.println(i);
            }

            for (int i = 0; i < arr.length; i++) {
                  System.out.println(arr[i]);
                  if (arr[i] == 3) {
                        System.out.println("Found 3");
                        return;
                  }
            }

      }

}
