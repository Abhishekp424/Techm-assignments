package ioTasks;


import java.io.File;
import java.util.Scanner;

public class FileSizeTask8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if (file.exists()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("File size in bytes: " + fileSizeInBytes);
            System.out.println("File size in KB: " + fileSizeInKB);
            System.out.println("File size in MB: " + fileSizeInMB);
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
