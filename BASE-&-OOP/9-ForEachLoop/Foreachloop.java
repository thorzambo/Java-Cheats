import java.util.Scanner;

public class Foreachloop{
      
      public static void main(String[] args){
            int[] arr = {1,5,6,4,32,5,88};
            String[] names = new String[5];
            Scanner scanner = new Scanner(System.in);

            int count = 0;
            for (int e:arr){
                  System.out.println(e + " " + count);
                  count++;
            }

            for (int i=0; i < names.length; i++){
                  System.out.print("input: ");
                  String input = scanner.nextLine();
                  names[i] = input;
                  if (input.equals("leo")){
                        break; // end of input
                  }
            }

            for (String n:names) {
                  System.out.print(n + " ");
            }

      }
}
