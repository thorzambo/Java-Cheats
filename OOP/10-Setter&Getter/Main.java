public class Main {

      public static void main(String[] args) {

            Person person = new Person("Leo", "zamba");

            String nm = person.getName();
            String sr = person.getSurname();

            System.out.println(nm);
            System.out.println(sr);

            person.setName("shhehsh");
            person.setSurname("shehshsh");
            System.out.println(person.getName());
            System.out.println(person.getSurname());
            
            Person person2 = new Person("SHesh", "dhfh");
            person2.copy(person);
            System.out.println(person2.getName() + person2.getSurname());

      }
}
