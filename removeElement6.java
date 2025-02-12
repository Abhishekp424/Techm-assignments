package CollectionApi;
import java.util.ArrayList;
import java.util.Scanner;
public class removeElement6 {
	public static void main(String[] arg) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		System.out.println(colors);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index of elment to Remove");
		int indexOfElmentToRemove=sc.nextInt();
		if(indexOfElmentToRemove<0 &&indexOfElmentToRemove<=colors.size()) {
			colors.remove(indexOfElmentToRemove);
		}else {
			System.out.println("Invalid index or  enter index b/w 0 - "+(colors.size()-1));
		}
		System.out.println(colors);
	}

}
