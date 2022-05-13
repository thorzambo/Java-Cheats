public class Car extends Vehicle {

      @Override
      void move() {
            System.out.println("The car moves");
      }

      @Override
      void slowDown() {
            System.out.println("The car is slow down");
      }

      @Override
      void speedUp() {
            System.out.println("The car speed up");
      }
}
