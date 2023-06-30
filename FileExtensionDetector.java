import java.io.File;

public class FileExtensionDetector  {
    public static void main(String[] args) {
        printFileExtension("D:\\GB JS\\Java_Project");
        

    }
    //================================================
    public static void printFileExtension(String dirPath){
        String currentDirectory = System.getProperty("user.dir");

        File folder = new File(currentDirectory);
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    String fileExtension = getFileExtension(fileName);
                    System.out.printf("File format = %s\n",fileExtension);}}}}


    private static String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        } else {
            return "";}}}
