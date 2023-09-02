package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class ZeroDivideException extends ArithmeticException {

    public ZeroDivideException() {
        System.err.println("\n Ошибка деления на 0: Пересмотрите все возможные делители \n ");
    }
}
