package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class task6 {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
        
        List<String> ascendingOrder = words.stream()
                                           .sorted()
                                           .collect(Collectors.toList());
        
        List<String> descendingOrder = words.stream()
                                            .sorted((a, b) -> b.compareTo(a))
                                            .collect(Collectors.toList());
        
        System.out.println("Sorted in ascending order: " + ascendingOrder);
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
