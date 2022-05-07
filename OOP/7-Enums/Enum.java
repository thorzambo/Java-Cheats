/**
 * Enums are collections of constants we can reference 
 */

 public enum Enum {

      HARD(3),
      MEDIUM(2),
      EASY(1);

      private int enumNum;

      private Enum(int num) { // Private only
            this.enumNum = num;
      }
      
      public int getNum() {
            return this.enumNum;
      }

      public void setNum(int num) {
            this.enumNum = num;
      }
 }
