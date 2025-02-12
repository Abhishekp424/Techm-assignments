package CollectionApi;

import java.util.Scanner;
import java.awt.Color;
import java.util.ArrayList;
public class RetriveElement4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> colors=new ArrayList<>();
		System.out.println("Enter number of elements in the List");
		int elementCount=sc.nextInt();
		for(int i=1;i<=elementCount;i++) {
			colors.add(sc.next());
		}
		System.out.println("Enter index of the elment to retrive");
		int index=sc.nextInt();
		if(index>=0 && index<elementCount) {
			System.out.println("Element at index "+index+" : "+colors.get(index));
		}else {
			System.out.println("Invalid index or enter index b/w 0 - "+elementCount);
		}
		
	}
}
