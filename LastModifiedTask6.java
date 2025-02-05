package ioTasks;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class LastModifiedTask6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if (file.exists()) {
            long lastModifiedTime = file.lastModified();
            Date date = new Date(lastModifiedTime);
            System.out.println("The last modified date of the file is: " + date);
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
