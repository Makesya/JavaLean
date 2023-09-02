package ExceptionHandling.AdvancedExceptionHandling.Workshop;

import java.io.FileReader;
import java.io.IOException;

public class NotFoundFIleMain {
    public static void main(String[] args) throws NotFoundFIleException {

        try (FileReader reader = new FileReader("abc");){
            reader.read();
        } catch (IOException e){
            throw new NotFoundFIleException();
        }

    }
}
