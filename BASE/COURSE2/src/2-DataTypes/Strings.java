public class Strings {

      public static void main(String[] args) {
            System.out.println("String cause of double quotes");

            // Since String is a class, thats the way you can do it more like an Object
            String str = new String("Shehs");
            // Normally Done like this:
            String string = "Shesh";
            System.out.println(str);
            System.out.println(string);

            System.out.println("My String is a " + str + " or a " + string + "?");
      }
}

