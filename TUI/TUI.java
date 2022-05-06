import java.util.Scanner;
import java.util.Locale;


public class TUI {

    private final Scanner scanner;


    public TUI() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    public static void main(final String[] args) {
        final TUI t = new TUI();
        t.run();
    }

    public void run() {
        final char type = askShapeType();
        if (type == 'r') {
            final Rectangle r = createRectangle();
            System.out.println("Created " + r);
            final Point dart = createPoint();
            tellWhetherInside(r, dart);
            drawShape(r);
        } else {
            final Circle c = createCircle();
            System.out.println("Created " + c);            
            final Point dart = createPoint();
            tellWhetherInside(c, dart);
            drawShape(c);
        }        
    }

    public char askShapeType() {
        System.out.println("What kind of shape would you like to create?");
        System.out.println("[r] Rectangle");
        System.out.println("[c] Circle");
        final String shapeTypeString = scanner.next();
        return shapeTypeString.charAt(0);
    }

    public Rectangle createRectangle() {
        System.out.println("Ok, let's create a rectangle!");
        System.out.println("x: ");
        final double x = scanner.nextDouble();
        System.out.println("y: ");
        final double y = scanner.nextDouble();
        System.out.println("width: ");
        final double width = scanner.nextDouble();
        System.out.println("height: ");
        final double height = scanner.nextDouble();
        return new Rectangle(x, y, width, height);
    }

    public Circle createCircle() {
        System.out.println("Ok, let's create a circle!");
        System.out.println("x: ");
        final double x = scanner.nextDouble();
        System.out.println("y: ");
        final double y = scanner.nextDouble();
        System.out.println("radius: ");
        final double radius = scanner.nextDouble();
        return new Circle(x, y, radius);
    }

    public Point createPoint() {
        System.out.println("Give me a point (throw a dart)!");
        System.out.println("x: ");
        final double x = scanner.nextDouble();
        System.out.println("y: ");
        final double y = scanner.nextDouble(); 
        return new Point(x, y);
    }

    public void tellWhetherInside(final Shape s, final Point dart) {
        // The "." in "s.contains" below is the most important thing 
        // in the second half of this course!
        final boolean isInside = s.contains(dart.getX(), dart.getY());
        if (isInside) {
            System.out.println("The point is inside!");
        } else {
            System.out.println("The point is NOT inside!");
        }
    }

    public void drawShape(final Shape s) {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                if (s.contains(x, y)) {
                    System.out.print('o');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

}
