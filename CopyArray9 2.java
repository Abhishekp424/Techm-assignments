package CollectionApi;

import java.util.ArrayList;
public class CopyArray9 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(21);
		numbers.add(16);
		numbers.add(34);
		numbers.add(37);
		System.out.println("ArrayList 1 : "+numbers);
		ArrayList<Integer> newArray=new ArrayList<>();
		newArray.addAll(numbers);
		System.out.println("After copying to ArrayList 2 : "+newArray);
		
	}
}
