package CollectionApi;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstAndLastOccurence {
	public static void main(String[] arg) {
		LinkedList<Integer> colors=new LinkedList<>();
		colors.add(21);
		colors.add(23);
		colors.add(31);
		colors.add(21);
		colors.add(53);
		System.out.println("Original List: "+colors);
		Integer searchElement = 21;
		int firstIndex =colors.indexOf(searchElement);
        int lastIndex = colors.lastIndexOf(searchElement);
        
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("'" + searchElement + "' is not present in the LinkedList.");
        }
		
		
}
}
