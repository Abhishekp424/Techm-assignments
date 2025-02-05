package exception;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class FileIsEmptyTask5 {
    public static void readFile(String fileName) throws EmptyFileException, IOException {
        File file = new File(fileName);
        if (file.length() == 0) {
            throw new EmptyFileException("Error: The file is empty.");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt"; 
        
        try {
           readFile(fileName);
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file. " + e.getMessage());
        }
    }
}
