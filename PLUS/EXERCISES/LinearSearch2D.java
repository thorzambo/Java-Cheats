class LinearSearch2D {
    public static int linearSearch2D(String[][] haystack, String target) {
     // write code here
     for (int i = 0; i < haystack.length; i ++) {
       for (int j = 0; j < haystack[i].length; j ++) {
         if (target == haystack[i][j]) {
           return i + j;
         }
       }
     }
     return - 1;
   }
    public static void main(String[] args) {
      String[][] haystack = {{"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"needle", "hay"}, {"hay", "hay"}};
      String target = "needle";
      linearSearch2D(haystack, target);
  }
 }
 