package streams;
import java.util.Arrays;
import java.util.List;

public class task7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(10, 20, 5, 40, 15, 30);

	    
	        int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();

	        int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();

	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);

	}
}
