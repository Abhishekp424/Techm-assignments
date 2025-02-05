package exception;

public class exceptionTask1 {
public static void main(String[] args) {
	try {
		int[] number= {1,2,3};
		System.out.println(number[2]);
		int result=10/0;
	}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Error: Array index out of bound");
}catch(ArithmeticException e) {
	System.out.println("Error: Arithmetic Exception");
}
	finally {
		System.out.println("final block executed");
	}
	
}
}
