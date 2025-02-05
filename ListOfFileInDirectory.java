package ioTasks;

import java.io.File;

public class ListOfFileInDirectory {
    public static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            File[] fileList = directory.listFiles();
            if (fileList != null && fileList.length > 0) {
            	System.out.println("*****------Directories-------******");
                for (File file : fileList) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR] " + file.getName()); // Print directories
                    }
                }
                System.out.println("\n********--------Files------******");
                for (File file : fileList) {
                    if (file.isFile()) {
                        System.out.println(file.getName()); // Print files
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void main(String[] args) {
        listFiles("C:/Users/katik/Downloads"); 
    }
}
