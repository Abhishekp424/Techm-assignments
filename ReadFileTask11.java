package ioTasks;


import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileTask11{
    public static void main(String[] args) {
        String filePath = "C:/Users/katik/OneDrive/Desktop/test.txt"; 
     //   "C:\Users\katik\OneDrive\Desktop\test.txt"
        File file = new File(filePath);

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
    
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);  
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
