package CollectionApi;
import java.util.ArrayList;
import java.util.Collections;

public class shuffleElements10 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println("Before Shuffle : "+numbers);
		Collections.shuffle(numbers);
		System.out.println("Ater shuffle :  "+numbers);
		
		
	}

}
