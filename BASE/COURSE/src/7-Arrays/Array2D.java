public class Array2D {
      /**
       * Array2D 
       * Lists in Lists basically
       */

      public static void main(String[] args) {
            
            String [][] classes = new String[3][4];
            
            // First Class (like school wise)
            classes[0][0] = "Leo";
            classes[0][1] = "Fede";
            classes[0][2] = "Ale";
            classes[0][3] = "Gianky";
            // Second Class 
            classes[1][0] = "Thor";
            classes[1][1] = "Lucy";
            classes[1][2] = "Scooby";
            classes[1][3] = "Daffy";
            // Third Class
            classes[2][0] = "Mamma";
            classes[2][1] = "Papa";
            classes[2][2] = "Gogo";
            classes[2][3] = "Aghe";

            System.out.println(classes[2][0]);

            for (int class_ = 0; class_ < classes.length; class_++) {
                  System.out.println();
                  for (int student = 0; student < classes[class_].length; student++) {
                        System.out.print(classes[class_][student] + " ");
                  }
            }

            /**
             * METHOD 2
             */
            System.out.println();

            String[][] classes_ = {
                  {"Leo", "Fede", "Ale", "Gianky"},
                  {"Thor", "Lucy", "Scooby", "Daffy"},
                  {"Mamma", "Papa", "Gogo", "Aghe"}
            };

            for (int class_ = 0; class_ < classes_.length; class_++) {
                  System.out.println();
                  for (int student = 0; student < classes_[class_].length; student++) {
                        System.out.print(classes_[class_][student] + " ");
                  }
            }

            System.out.println();

            for (String[] class_: classes_) {
                  System.out.println();
                  for (String student: class_) {
                        System.out.print(student + " ");
                  }
            }
      }
}
