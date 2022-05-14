/**
 * IMPLEMENTS
 */

class Car implements Vehicle {

      private int gear = 0;
      private int speed = 0;

      public void changeGear(int gear) {
            this.gear = gear;
      }

      public void speedUp(int change) {
            this.speed += change;
      }

      public void slowDown(int change) {
            this.speed -= change;
      }

      public void display() {
            System.out.println("I am a Car, going " + this.speed + " Km/h and I am in Gear " + gear);
            out();
      }
      
}
