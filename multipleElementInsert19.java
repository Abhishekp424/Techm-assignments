package CollectionApi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class multipleElementInsert19{
	public static void main(String[] arg) {
		LinkedList<String> color=new LinkedList<>();
		color.add("red");
		color.add("blue");
		color.add("pink");
		color.add("yellow");
		System.out.println("Original Likedlist : "+color);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to insert an element to LinkedList : ");
		int i=sc.nextInt();
		List<String> li=List.of("green","maroon");
		
		color.addAll(i, li);
		System.out.println("LinkedListt after Inseting multiple elements at position "+i+" =\n"+color);
		
		
	}

}
