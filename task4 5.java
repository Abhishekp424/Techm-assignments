package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5);
        
        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()
                                             .collect(Collectors.toList());
        
        System.out.println("List after removing duplicates: " + uniqueNumbers);
        }
}
