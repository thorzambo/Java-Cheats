public class Mainfs {

      public static void main(String[] args) {

            final int test = 1;

            //test = 10; //CAN'T BE CHANGED!!!!!!  cause final;

            //System.out.println(test);

            NameSurname namesur1 = new NameSurname("Ciao", "Sig");
            NameSurname namesur2 = new NameSurname("Thor", "Thorellus");

            System.out.println(namesur1);
            System.out.println(namesur2);
            
            NameSurname.showNr();

      }
}
