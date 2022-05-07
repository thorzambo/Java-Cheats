/**
 * Interface called Vehicle:
 * An Interface is something that is completely abstract.class Vehicle 
 * It must be Inherit from
 * We can only have public methods and we cannot define them directly
 */

 public interface Vehicle {
       
      final int gears = 5; // they must be final CANNOT CHANGE

      void changeGear(int a);
      void speedUp(int a); // this is completely abstract, it just exhists, to use inside the Car class.
      void slowDown(int a);        // This basically says that this method will exhist in any class that implements this.

      default void out() {
            System.out.println("Default Method");
      }

      static int math(int b) {
            return b + 9;
      }
 }
