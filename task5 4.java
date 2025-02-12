package streams;
import java.util.Arrays;
import java.util.List;

public class task5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
	        char specificLetter = 'a';
	        
	        long count = words.stream()
	                          .filter(word -> word.startsWith(String.valueOf(specificLetter)))
	                          .count();
	        
	        System.out.println("Number of words starting with '" + specificLetter + "': " + count);
	   }
}
