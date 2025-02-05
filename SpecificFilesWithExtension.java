package ioTasks;

import java.io.File;

public class SpecificFilesWithExtension {
    public static void listFilesWithExtension(String directoryPath, String extension) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(extension));
            
            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + extension + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files found with extension " + extension);
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void main(String[] args) {
        listFilesWithExtension("C:/Users/katik/Documents", ".txt"); // Change folder and extension as needed
    }
}
