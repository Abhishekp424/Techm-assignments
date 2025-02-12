package CollectionApi;
import java.util.Scanner;
import java.util.LinkedList;
public class AppendToLinkedList11 {
	public static void main(String[] arg) {
		LinkedList<Integer> colors=new LinkedList<>();
		colors.add(21);
		colors.add(23);
		colors.add(31);
		colors.add(48);
		colors.add(53);
		System.out.println("Before Appending : "+colors);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to append : ");
		int number=sc.nextInt();
		colors.add(number);
		System.out.println("After appending : "+colors);
	}

}
