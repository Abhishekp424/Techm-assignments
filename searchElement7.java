package CollectionApi;
import java.util.ArrayList;
import java.util.Scanner;

public class searchElement7 {
	public static void main(String[] arg) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("pink");
		colors.add("yellow");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elment to search");
		String element=sc.next();
		if(colors.contains(element)) {
			System.out.println(element+" is found in the List ");
		}else {
			System.out.println("Elements not found");
		}
		
		
	}

}
