package ioTasks;

import java.io.File;
import java.util.Scanner;

public class PathCheckTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The given path is a FILE.");
            } else if (file.isDirectory()) {
                System.out.println("The given path is a DIRECTORY.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
}
