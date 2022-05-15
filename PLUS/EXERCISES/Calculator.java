public class Calculator {

    int result;

    public Calculator() {
    }

    public int add(int x, int y) {
        result = x + y;
        return result;
    }

    public int substract(int x, int y) {
        result = x - y;
        return result;
    }

    public int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    public int devide(int x, int y) {
        try {
            result = x / y;
        }
        catch (Exception e) {
            System.out.println(e);
            }
        return result;
    }

    public int modulo(int x, int y) {
        result = x % y;
        return result;
    }
}