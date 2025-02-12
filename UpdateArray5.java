package CollectionApi;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArray5 {
	public static void main(String[] arg) {
		
		ArrayList<String> colors= new ArrayList<>();
		colors.add("red");
		colors.add("pink");
		colors.add("blue");
		colors.add("green");
		System.out.println("ArrayList Before Updation : "+colors);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color to update : ");
		String newColor=sc.next();
		colors.set(2, newColor);
		System.out.println("Updated ArrayList : "+colors);
	}
}
