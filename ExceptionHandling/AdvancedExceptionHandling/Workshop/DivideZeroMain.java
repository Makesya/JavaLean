package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class DivideZeroMain {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            throw new ZeroDivideException();
        }
    }
}
