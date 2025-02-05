package ioTasks;

import java.io.File;
import java.util.Scanner;

public class FileExistsTask3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file or directory path: ");
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The given path is a file and it exists.");
            } else if (file.isDirectory()) {
                System.out.println("The given path is a directory and it exists.");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
