package CollectionApi;
import java.util.LinkedList;
import java.util.Scanner;
public class InsertLinkedList15 {
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
		String element=sc.next();
		color.add(i, element);
		System.out.println("LinkedListt after Inseting at position "+i+" "+color);
		
		
	}

}
