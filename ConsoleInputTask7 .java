package ioTasks;

import java.util.Scanner;

public class ConsoleInputTask7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.println("You entered: " + inputString);

        System.out.print("Enter an integer: ");
        int inputInt = sc.nextInt();
        System.out.println("You entered the integer: " + inputInt);

        System.out.print("Enter a float number: ");
        float inputFloat = sc.nextFloat();
        System.out.println("You entered the float: " + inputFloat);

        sc.close();
    }
}
