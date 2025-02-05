package exception;
import java.util.*;
import java.io.*;
public class FileReaderTask3 {
	public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
	public static void main(String[] args) {
		
		try {
            readFile("ex.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Error:File not found  " + e.getMessage());
        }
	}

}
