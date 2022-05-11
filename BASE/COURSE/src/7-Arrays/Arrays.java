public class Arrays{

      public static void main(String[] args){
            /* 
            Arrays are collections of elements with a set Size
                  1. Set the data type your erray needs to be -> int double String boolean char
                  2. set the name of that Array
                  3. new + again type
                  4. Set the size of that Array, how many elements
            */

            int[] newArrInt = new int[5]; //{1, 5, 10, 8, 30}
            String[] newArrStr = new String[5]; //{"ciao", "Come", "StAi", "Leo", "Thor"}
            
            // Change/add elements to Array
            newArrInt[0] = 1;
            newArrInt[1] = 2;
            newArrInt[2] = 3;
            newArrInt[3] = 4;
            newArrInt[4] = 5;

            // == to int[] newArrInt = {1, 2, 3, 4, 5}

            System.out.println(newArrStr.length);


            String[] newArrayStrTest = {"Ciao", "Come", "StAi", "Leo", "Thor"};
            
            // Access to Elemnts in Array
            int x = newArrInt[3];
            System.out.println(newArrayStrTest);

            for (int i = 0; i < newArrInt.length; i++) {
                  System.out.println(newArrInt[i]);
            }
            for (int nr : newArrInt) {
                  System.out.println(nr);
            }

      }
}
