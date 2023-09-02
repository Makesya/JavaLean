package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class EmptyCellArrayException extends NullPointerException {
    public EmptyCellArrayException() {
        throw new RuntimeException("\n\n В массиве обнаружены пустые ячейки (null) \n");
    }
}
