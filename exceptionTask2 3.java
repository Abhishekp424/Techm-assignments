package exception;
import java.util.Scanner;

class OddNumberException extends Exception {
	    public OddNumberException(String message) {
	        super(message);
	    }
}

public class exceptionTask2 {

	    public static void checkEvenNumber(int number) throws OddNumberException {
	        if (number % 2 != 0) {
	            throw new OddNumberException("The number is odd. Odd numbers are not allowed.");
	        }
	        System.out.println("The number " + number + " is even.");
	    }

	    public static void main(String[] args) {
	        try {
	        	Scanner scan=new Scanner(System.in);
	        	int number=scan.nextInt();
	        	checkEvenNumber(number);  
	        } catch (OddNumberException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }
}

	

