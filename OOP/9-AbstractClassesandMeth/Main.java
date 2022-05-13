/** 
 * Abstract -> Limited restricted, Classes not for creating object, 
 * but for being used by other classes (not abstract classes) only.
 * can only be inheritated
 * -----------------------
 * abstract class vehicle
 * concrete child class car
 * abstract mathods
 * 
 */

public class Main {

      public static void main(String[] args) {
            
            Car car = new Car();

            car.speedUp();
            car.slowDown();
            car.move();
      }
}
