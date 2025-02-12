package CollectionApi;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertAtEnd {
	public static void main(String[] arg) {
		LinkedList<Integer> colors=new LinkedList<>();
		colors.add(21);
		colors.add(23);
		colors.add(31);
		colors.add(48);
		colors.add(53);
		System.out.println("Original List: "+colors);
		
		colors.add(colors.size(),58);
		System.out.println("After insertion at end : "+colors);

}
}
