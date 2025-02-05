package ioTasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArrayTask9{
    public static void main(String[] args) {
        String filePath = "C:/Users/katik/OneDrive/Desktop/sushi/coding/java codes"; 

        File file = new File(filePath);
        
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                long fileSize = file.length();
                
                byte[] fileBytes = new byte[(int) fileSize];
                
                fis.read(fileBytes);
                System.out.println("File content as byte array: ");
                for (byte b : fileBytes) {
                    System.out.print(b + " ");
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
