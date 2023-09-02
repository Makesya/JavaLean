package ExceptionHandling.AdvancedExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lecture {
    public static void main(String[] args) {
        String path = "D:\\JavaProjects\\JavaLean\\ExceptionHandling\\AdvancedExceptionHandling\\file.txt";
        try (FileReader reader = new FileReader(path);
             FileWriter writer = new FileWriter("test.txt");
        ) {
            //======================================
            while (reader.ready()) {
                writer.write(reader.read());
            }

            //======================================
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Copy successful");
        }
    }

}
