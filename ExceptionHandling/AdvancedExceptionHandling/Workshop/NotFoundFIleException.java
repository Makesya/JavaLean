package ExceptionHandling.AdvancedExceptionHandling.Workshop;

import java.io.FileNotFoundException;

public class NotFoundFIleException extends FileNotFoundException {

    public NotFoundFIleException() {
        System.err.println("\n\n Не могу найти такой файл\n");
    }
}
