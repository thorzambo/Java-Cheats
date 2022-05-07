public class Mainenum {

      public static void main(String[] args) {

            Enum lvl = Enum.MEDIUM;
            String en = lvl.toString();
            Enum[] arr = Enum.values();
            System.out.println(en + " shesh");
            
            for (Enum e:arr) {
                  System.out.println(e);
            }

            if (lvl == Enum.HARD) {
                  System.out.println(lvl + " Check HARD");
            } else if (lvl == Enum.EASY) {
                  System.out.println(lvl + " Check level EASY");
            } else {
                  System.out.println(lvl + " Check MEDIUM");
            }

            System.out.println(lvl.getNum());
            System.out.println(Enum.valueOf("EASY"));
            lvl.setNum(5);
            System.out.println(lvl.getNum());
      }
}
