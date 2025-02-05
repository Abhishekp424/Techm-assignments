package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class PositiveException extends Exception {
    public PositiveException(String message) {
        super(message);
    }


public static void readFile(String fileName) throws PositiveException {
    File file = new File(fileName);
    Scanner sc = new Scanner(fileName);

    while (sc.hasNextLine()) {
        String line = sc.nextLine().trim();
        int num = Integer.parseInt(line);
        
        if (num > 0) {
            throw new PositiveException("Error: Positive number found - " + num);
        } else {
            System.out.println(num);
        }
    }
    sc.close();
}

	public static void main(String[] args) {
		
		try {
            readFile("exa.txt"); 
        } catch (PositiveException e) {
            System.out.println("Error:File not found  " + e.getMessage());
        }
	}

}

