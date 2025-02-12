package CollectionApi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class LinkedList13 {
	public static void main(String[] arg) {
		LinkedList<String> colors=new LinkedList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("pink");
		colors.add("yellow");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to iterate from : ");
		int i=sc.nextInt();
		ListIterator<String> colorIter=colors.listIterator(i);
		
		while(colorIter.hasNext()) {
			System.out.println(colorIter.next());
		}
	}

}
