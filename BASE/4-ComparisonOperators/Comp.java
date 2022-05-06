public class Comp {
    
      public static void main(String[] args){
            int x = 6;
            int y = 7;
            int z = 10;

            String ciao = "ciao";
            String hello = "hello";

            /* we have 6 operators:
                  >
                  <
                  == if Want to compare 2 strings you need to ciao.equals(hello)
                  >=
                  <=
                  !=
            */
            boolean compareNR = x > y;
            boolean compareSTR = hello  != ciao;

            /* then we have:
                  &&  ->  AND
                  ||  -> OR
            */
            boolean compare = x == x && y == y || z == z;

            System.out.println(compare);

    }
}
